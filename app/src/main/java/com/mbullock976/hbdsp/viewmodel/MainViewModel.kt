package com.mbullock976.hbdsp.viewmodel

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.mbullock976.hbdsp.model.Bible
import com.mbullock976.hbdsp.model.Book
import com.mbullock976.hbdsp.model.Verse
import com.mbullock976.hbdsp.network.ApiError
import com.mbullock976.hbdsp.network.response.ApiResponseMessage
import com.mbullock976.hbdsp.network.response.ApiResponseStatus
import com.mbullock976.hbdsp.service.IBibleService
import kotlin.random.Random

class MainViewModel (private val service: IBibleService) : ViewModel(), IMainViewModel {

    companion object {
        const val TAG = "MainViewModel"
    }

    override fun getVerse(
        bookName: String,
        chapterNo: Int,
        verseNo: Int
    ): LiveData<ApiResponseMessage<Verse>> {

        return service.getVerse(bookName, chapterNo, verseNo)
    }

    override fun addNewTestamentVerse() : LiveData<ApiResponseMessage<Verse>>? {

        var liveData: LiveData<ApiResponseMessage<Verse>>? = null

        val bible = Bible()
        val book = bible.books.random()
        val bookName = book.name

        val chapterNo = book.chapters.keys.random()
        val maxVerseNo = book.chapters[chapterNo]

        var verseNo = maxVerseNo?.let { Random.nextInt(1, it) }

        verseNo?.let {
           liveData = this.getVerse(bookName, chapterNo, it)
        }

        return liveData
    }

    override fun addPsalmsVerse() : LiveData<ApiResponseMessage<Verse>>? {

        var liveData: LiveData<ApiResponseMessage<Verse>>? = null

        val bible = Bible()
        val chapterNo = bible.psalms.keys.random()
        val maxVerseNo = bible.psalms[chapterNo]

        var verseNo = maxVerseNo?.let { Random.nextInt(1, it) }

        verseNo?.let {
            liveData = this.getVerse("psalms", chapterNo, it)
        }

        return liveData
    }

    override fun addProverbsVerse()  : LiveData<ApiResponseMessage<Verse>>? {

        var liveData: LiveData<ApiResponseMessage<Verse>>? = null

        val bible = Bible()
        val chapterNo = bible.proverbs.keys.random()
        val maxVerseNo = bible.proverbs[chapterNo]

        var verseNo = maxVerseNo?.let { Random.nextInt(1, it) }

        verseNo?.let {
            liveData =  this.getVerse("proverbs", chapterNo, it)
        }

        return liveData
    }

}