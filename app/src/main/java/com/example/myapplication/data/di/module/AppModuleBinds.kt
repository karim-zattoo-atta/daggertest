package com.example.myapplication.data.di.module

import com.example.myapplication.data.DataRepository
import com.example.myapplication.data.DefaultDataRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface AppModuleBinds {

    @Singleton
    @Binds
    fun bindRepository(defaultDataRepository: DefaultDataRepository): DataRepository

}