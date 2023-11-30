package com.example.myapplication.di.module

import com.example.myapplication.data.DataSource
import com.example.myapplication.data.remote.RemoteDataSource
import com.example.myapplication.network.ApiService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class TestAppModule {

    @Singleton
    @Provides
    fun provideTasksRemoteDataSource(
        apiService: ApiService
    ): DataSource {
        return RemoteDataSource(apiService)
    }
}