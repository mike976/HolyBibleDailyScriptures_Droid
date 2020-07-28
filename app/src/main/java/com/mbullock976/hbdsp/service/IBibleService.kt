package com.mbullock976.hbdsp.service

import androidx.lifecycle.LiveData
import com.mbullock976.hbdsp.model.Verse
import com.mbullock976.hbdsp.network.response.ApiResponseMessage

interface IBibleService {
    fun getVerse(bookName: String = "", chapterNo: Int, verseNo: Int): LiveData<ApiResponseMessage<Verse>>
}