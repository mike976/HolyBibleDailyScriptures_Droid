package com.mbullock976.hbdsp.di

import com.mbullock976.hbdsp.network.IApiClient
import com.mbullock976.hbdsp.service.BibleService
import com.mbullock976.hbdsp.service.IBibleService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

//This is like a AutoFacInstaller class for a ClassLibrary in C#
//IApiClient is resolved by Dagger in the IOC AppComponent, because it refs NetworkModule which provides IApiClient to Dagger

@Module
internal class ServiceModule {

    @Provides
    @Singleton
    fun providesBibleService(api: IApiClient): IBibleService {
        return BibleService(api)
    }
}