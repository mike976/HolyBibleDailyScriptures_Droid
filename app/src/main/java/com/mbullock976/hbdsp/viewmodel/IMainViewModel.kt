package com.mbullock976.hbdsp.viewmodel

import androidx.lifecycle.LiveData
import com.mbullock976.hbdsp.model.Verse
import com.mbullock976.hbdsp.network.response.ApiResponseMessage

interface IMainViewModel {
    fun getVerse(bookName: String, chapterNo: Int, verseNo: Int) : LiveData<ApiResponseMessage<Verse>>

    fun addNewTestamentVerse() : LiveData<ApiResponseMessage<Verse>>?
    fun addPsalmsVerse() : LiveData<ApiResponseMessage<Verse>>?
    fun addProverbsVerse()  : LiveData<ApiResponseMessage<Verse>>?
}

