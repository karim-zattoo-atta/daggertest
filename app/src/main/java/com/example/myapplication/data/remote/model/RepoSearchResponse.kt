package com.example.myapplication.data.remote.model

import com.google.gson.annotations.SerializedName

data class RepoSearchResponse(
    // Gson
    @SerializedName("total_count") val total: Int = 0,
    @SerializedName("items") val items: List<Repo> = emptyList(),

    // Moshi
    /*@Json(name = "total_count") val total: Int = 0,
    @Json(name = "items") val items: List<Repo> = emptyList(),*/

    val nextPage: Int? = null
)
