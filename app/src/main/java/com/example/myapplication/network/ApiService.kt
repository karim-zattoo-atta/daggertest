package com.example.myapplication.network

import com.example.myapplication.data.remote.model.RepoSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    /**
     * Get repos ordered by stars.
     */
    @GET("search/repositories?sort=stars")
    suspend fun searchRepos(
        @Query("q") query: String,
        @Query("page") page: Int,
        @Query("per_page") itemsPerPage: Int
    ): RepoSearchResponse

}