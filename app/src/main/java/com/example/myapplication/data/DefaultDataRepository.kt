package com.example.myapplication.data

import com.example.myapplication.data.remote.model.RepoSearchResponse
import javax.inject.Inject

class DefaultDataRepository @Inject constructor(
    private val remoteDataSource: DataSource
) : DataRepository {

    override suspend fun getSearchResponse(
        query: String,
        page: Int,
        itemsPerPage: Int
    ): Result<RepoSearchResponse> {
        return try {
            val result = remoteDataSource.getSearchResponse(query, page, itemsPerPage)
            Result.Success(result)
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

}