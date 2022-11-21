package com.andres.mercadolibre.data.repository

import com.andres.mercadolibre.data.remote.MeliApi
import com.andres.mercadolibre.domain.model.detail.DetailResponse
import com.andres.mercadolibre.domain.model.categories.CategoriesResponse
import com.andres.mercadolibre.domain.model.description.DescriptionResponse
import com.andres.mercadolibre.domain.model.search.SearchResponse
import com.andres.mercadolibre.domain.repository.MeliRepositoryRemote

class MeliRepositoryRemoteImpl(
    private val api: MeliApi,
) : MeliRepositoryRemote {

    override suspend fun getDetails(id: String): Result<DetailResponse> {
        return try {
            val result = api.getDetails(id)
            Result.success(result)
        } catch (exception: Exception) {
            Result.failure(exception)
        }
    }

    override suspend fun getDescription(id: String): Result<DescriptionResponse> {
        return try {
            val result = api.getDescription(id)
            Result.success(result)
        } catch (exception: Exception) {
            Result.failure(exception)
        }
    }

    override suspend fun getBySearch(product: String, limit: Int, offset: Int): Result<SearchResponse> {
        return try {
            val result = api.getBySearch(product, limit, offset)
            Result.success(result)
        } catch (exception: Exception) {
            Result.failure(exception)
        }
    }

    override suspend fun getCategories(): Result<CategoriesResponse> {
        return try {
            val result = api.getCategories()
            Result.success(result)
        } catch (exception: Exception) {
            Result.failure(exception)
        }
    }
}