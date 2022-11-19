package com.andres.mercadolibre.data.remote

import com.andres.mercadolibre.domain.model.detail.DetailResponse
import com.andres.mercadolibre.domain.model.categories.CategoriesResponse
import com.andres.mercadolibre.domain.model.description.DescriptionResponse
import com.andres.mercadolibre.domain.model.search.SearchResponse
import com.andres.mercadolibre.util.Constants.CATEGORIES_END_POINT
import com.andres.mercadolibre.util.Constants.DESCRIPTION_END_POINT
import com.andres.mercadolibre.util.Constants.DETAILS_END_POINT
import com.andres.mercadolibre.util.Constants.KEY_ID
import com.andres.mercadolibre.util.Constants.PRODUCT
import com.andres.mercadolibre.util.Constants.SEARCH_END_POINT
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MeliApi {

    @GET(DETAILS_END_POINT)
    suspend fun getDetails(
        @Path(KEY_ID) id: String,
    ): DetailResponse

    @GET(DESCRIPTION_END_POINT)
    suspend fun getDescription(
        @Path(KEY_ID) id: String,
    ): DescriptionResponse

    @GET(SEARCH_END_POINT)
    suspend fun getBySearch(
        @Query(PRODUCT) product: String,
    ): SearchResponse

    @GET(CATEGORIES_END_POINT)
    suspend fun getCategories(): CategoriesResponse
}