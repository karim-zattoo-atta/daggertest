package com.example.myapplication.ui.di

import com.example.myapplication.ui.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
Created by Prokash Sarkar on Tue, January 19, 2021
 **/

@Module
interface MainFragmentsBuilderModule {

    @ContributesAndroidInjector
    fun contributeMainFragment(): MainFragment
}