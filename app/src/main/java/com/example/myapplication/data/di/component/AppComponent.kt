package com.example.myapplication.data.di.component

import android.content.Context
import com.example.myapplication.data.di.ViewModelBuilderModule
import com.example.myapplication.data.di.module.ActivityBuildersModule
import com.example.myapplication.data.di.module.AppModule
import com.example.myapplication.data.di.module.AppModuleBinds
import com.example.myapplication.data.di.module.NetworkModule
import com.example.myapplication.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class, NetworkModule::class,
        AppModule::class, AppModuleBinds::class,
        ViewModelBuilderModule::class, ActivityBuildersModule::class
    ]
)
interface AppComponent : AndroidInjector<DaggerApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }

    fun inject(app: BaseApplication)

}