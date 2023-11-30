package com.example.myapplication.di.component

import android.content.Context
import com.example.myapplication.TestBaseApplication
import com.example.myapplication.data.DefaultDataRepositoryTest

import com.example.myapplication.di.module.TestAppModule
import com.example.myapplication.data.di.ViewModelBuilderModule
import com.example.myapplication.data.di.component.AppComponent
import com.example.myapplication.data.di.module.ActivityBuildersModule
import com.example.myapplication.data.di.module.AppModuleBinds
import com.example.myapplication.data.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class, NetworkModule::class,
        TestAppModule::class, AppModuleBinds::class,
        ViewModelBuilderModule::class, ActivityBuildersModule::class
    ]
)
interface TestAppComponent : AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): TestAppComponent
    }

    fun inject(app: TestBaseApplication)

    fun inject(test: DefaultDataRepositoryTest)

}