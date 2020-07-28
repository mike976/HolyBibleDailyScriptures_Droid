package com.mbullock976.hbdsp.service

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mbullock976.hbdsp.model.Verse
import com.mbullock976.hbdsp.network.ApiError
import com.mbullock976.hbdsp.network.IApiClient
import com.mbullock976.hbdsp.network.response.ApiResponseMessage
import com.mbullock976.hbdsp.network.response.VerseApiResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class BibleService  @Inject constructor (private val api: IApiClient): IBibleService {

    override fun getVerse(
        bookName: String,
        chapterNo: Int,
        verseNo: Int
    ): LiveData<ApiResponseMessage<Verse>> {

        val liveData = MutableLiveData<ApiResponseMessage<Verse>>()

        var url = "https://bible-api.com/${bookName}${chapterNo}:${verseNo}"

        api.getVerse(url).enqueue(object : Callback<VerseApiResponse> {

            override fun onResponse(
                call: Call<VerseApiResponse>,
                response: Response<VerseApiResponse>
            ) {
                if (response.isSuccessful) {
                        val body = response.body()

                        if( body != null ) {
                            var reference = body.reference
                            var text = body.text
                            var translationName = body.translationName

                            val verse = Verse(reference, text, translationName)
                            liveData.value = ApiResponseMessage.success(verse)
                        } else liveData.value = ApiResponseMessage.success(Verse())


                } else {
                    liveData.value = ApiResponseMessage.error(ApiError.GETVERSE, null)
                }
            }

            override fun onFailure(call: Call<VerseApiResponse>, t: Throwable) {
                print("mike" + t.localizedMessage)
            }

        })

        return liveData
    }

}