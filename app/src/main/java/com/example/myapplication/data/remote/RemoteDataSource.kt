package com.example.myapplication.data.remote

import com.example.myapplication.data.DataSource
import com.example.myapplication.data.remote.model.RepoSearchResponse
import com.example.myapplication.network.ApiService
import javax.inject.Inject


class RemoteDataSource @Inject constructor(
    private val apiService: ApiService
) : DataSource {

    private val IN_QUALIFIER = "in:name,description"

    override suspend fun getSearchResponse(
        query: String,
        page: Int,
        itemsPerPage: Int
    ): RepoSearchResponse {
        return apiService.searchRepos(
            "$query $IN_QUALIFIER",
            page,
            itemsPerPage
        )
    }

}