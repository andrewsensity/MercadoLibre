package com.andres.mercadolibre.domain.repository

import com.andres.mercadolibre.domain.model.detail.DetailResponse
import com.andres.mercadolibre.domain.model.categories.CategoriesResponse
import com.andres.mercadolibre.domain.model.description.DescriptionResponse
import com.andres.mercadolibre.domain.model.search.SearchResponse

interface MeliRepositoryRemote {

    suspend fun getDetails(id: String): Result<DetailResponse>

    suspend fun getDescription(id: String): Result<DescriptionResponse>

    suspend fun getBySearch(product: String, limit: Int, offset: Int): Result<SearchResponse>

    suspend fun getCategories(): Result<CategoriesResponse>
}