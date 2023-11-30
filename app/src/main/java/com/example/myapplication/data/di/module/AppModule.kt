package com.example.myapplication.data.di.module

import com.example.myapplication.data.DataSource
import com.example.myapplication.data.remote.RemoteDataSource
import com.example.myapplication.network.ApiService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideTasksRemoteDataSource(
        apiService: ApiService
    ): DataSource {
        return RemoteDataSource(apiService)
    }

}