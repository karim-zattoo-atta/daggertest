package com.example.myapplication.data

import com.example.myapplication.data.remote.model.RepoSearchResponse

/**
Created by Prokash Sarkar on Tue, January 19, 2021
 **/

interface DataRepository {

    suspend fun getSearchResponse(
        query: String,
        page: Int,
        itemsPerPage: Int
    ): Result<RepoSearchResponse>

}