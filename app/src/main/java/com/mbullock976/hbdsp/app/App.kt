package com.mbullock976.hbdsp.app

import android.app.Application
import com.mbullock976.hbdsp.di.AppComponent
import com.mbullock976.hbdsp.di.DaggerAppComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent
            .builder()
            .build()

    }
}

//we expose the Dagger Component IOC container for the lifetime of the app
//notice in AndroidManifest.xml we have added name to the application element woth .app.App

lateinit var component: AppComponent