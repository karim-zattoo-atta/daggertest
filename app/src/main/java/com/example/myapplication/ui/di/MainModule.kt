package com.example.myapplication.ui.di

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.di.ViewModelKey
import com.example.myapplication.ui.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
Created by Prokash Sarkar on Tue, January 19, 2021
 **/

@Module
interface MainModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

}