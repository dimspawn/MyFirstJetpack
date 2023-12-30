package com.myfirstjetpack.core.data

import com.myfirstjetpack.core.data.source.remote.network.ApiResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

abstract class SearchNetworkBoundResource<ResultType, RequestType> {
    private var searchResult: Flow<Resource<ResultType>> = flow {
        emit(Resource.Loading())
        val dbSource = loadFromDb().first()
        safeDeleteSearchResult(dbSource)

        when(val apiResponse = createCall().first()) {
            is ApiResponse.Success -> {
                val allDbSource = getAllMovies().first()
                saveCallResult(apiResponse.data, allDbSource)
                emitAll(loadFromDb().map { Resource.Success(it) })
            }
            is ApiResponse.Empty -> {
                emitAll(loadFromDb().map { Resource.Success(it) })
            }
            is ApiResponse.Error -> {
                emit(Resource.Error(apiResponse.errorMessage))
            }
        }
    }

    protected abstract fun safeDeleteSearchResult(data: ResultType)
    protected abstract suspend fun createCall(): Flow<ApiResponse<RequestType>>
    protected abstract suspend fun saveCallResult(dataResponse: RequestType, data: ResultType)
    protected abstract fun loadFromDb(): Flow<ResultType>
    protected abstract fun getAllMovies(): Flow<ResultType>
    fun asFlow(): Flow<Resource<ResultType>> = searchResult
}