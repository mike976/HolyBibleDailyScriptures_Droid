package com.mbullock976.hbdsp.di

import com.mbullock976.hbdsp.MainActivity
import com.mbullock976.hbdsp.viewmodel.MainViewModel
import dagger.Component
import javax.inject.Singleton

//DAGGER IOC CONTAINER
// Modules are like AutofacInstaller classes when working at NEC.
//      Modules are required in the Dagger App component if you're exposing dependencies as interfaces
// Notice we are stating the modules here as single instance, for the lifetime of the Dagge IOC AppComponent

@Singleton
@Component(
    modules = [
        NetworkModule::class,
        ServiceModule::class,
        ViewModelModule::class]
)
interface AppComponent {

    //here we tell dagger that MainActivity depends on it, to supply member variables that have been annotated with @Inject
    //in this project example, we are injecting the viewmodelfactory into mainactivity
    fun inject(activity: MainActivity)

    fun inject(mainViewModel: MainViewModel)

}