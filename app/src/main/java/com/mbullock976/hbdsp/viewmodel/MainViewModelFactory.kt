package com.mbullock976.hbdsp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mbullock976.hbdsp.service.IBibleService
import javax.inject.Inject

@Suppress("UNCHECKED_CAST")
class MainViewModelFactory @Inject constructor (private val bibleService: IBibleService) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(bibleService) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}