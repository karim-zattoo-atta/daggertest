package com.example.myapplication.data.di.module

import com.example.myapplication.data.di.scopes.ActivityScope
import com.example.myapplication.ui.MainActivity
import com.example.myapplication.ui.di.MainFragmentsBuilderModule

import com.example.myapplication.ui.di.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBuildersModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class, MainFragmentsBuilderModule::class])
    fun contributeMainActivity(): MainActivity

}