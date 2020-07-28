package com.mbullock976.hbdsp.di

import com.mbullock976.hbdsp.service.IBibleService
import com.mbullock976.hbdsp.viewmodel.MainViewModelFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ViewModelModule {

    @Provides
    @Singleton
    fun providesMainViewModelFactory(service: IBibleService): MainViewModelFactory {
        return MainViewModelFactory(service)
    }

}