package com.andres.mercadolibre.data.source

import android.util.Log
import androidx.compose.runtime.rememberCoroutineScope
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.andres.mercadolibre.domain.model.search.Result
import com.andres.mercadolibre.domain.model.search.SearchResponse
import com.andres.mercadolibre.domain.repository.MeliRepositoryRemote
import com.andres.mercadolibre.util.Constants.EMPTY
import kotlinx.coroutines.coroutineScope

class MeliDataSource(
    private val repo: MeliRepositoryRemote,
    private val product: String
) : PagingSource<Int, Result>() {

    override fun getRefreshKey(state: PagingState<Int, Result>): Int? {
        return state.anchorPosition?.let { position ->
            val page = state.closestPageToPosition(position)
            page?.prevKey?.minus(1) ?: page?.nextKey?.plus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Result> {
        return try {
            val page = params.key ?: 1
            var response = SearchResponse()
            coroutineScope {
                repo.getBySearch(product = product, offset = page, limit = params.loadSize)
                    .onSuccess { searchResponse ->
                        response = searchResponse
                    }.onFailure {
                        val errorCode = it.message ?: EMPTY
                        Log.e("error_search", errorCode)
                        return@onFailure
                    }
                LoadResult.Page(
                    data = response.results,
                    prevKey = if (page == 1) null else page - 50,
                    nextKey = if (response.results.isNotEmpty()) page + 50 else null
                )
            }
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}