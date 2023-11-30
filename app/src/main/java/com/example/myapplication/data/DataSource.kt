package com.example.myapplication.data

import com.example.myapplication.data.remote.model.RepoSearchResponse


interface DataSource {

    suspend fun getSearchResponse(
        query: String,
        page: Int,
        itemsPerPage: Int
    ): RepoSearchResponse

}