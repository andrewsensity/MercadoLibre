package com.andres.mercadolibre.ui.views.main

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.andres.mercadolibre.data.source.MeliDataSource
import com.andres.mercadolibre.domain.model.categories.CategoriesResponse
import com.andres.mercadolibre.domain.repository.MeliRepositoryRemote
import com.andres.mercadolibre.domain.use_case.MeliUseCases
import com.andres.mercadolibre.util.Constants.EMPTY
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val meliUseCases: MeliUseCases,
    private val repositoryRemote: MeliRepositoryRemote,
) : ViewModel() {

    var categories by mutableStateOf(CategoriesResponse())
        private set
    var isLoading by mutableStateOf(false)
        private set
    var productBySearch by mutableStateOf("")
        private set

    var resultPager by mutableStateOf(Pager(
        PagingConfig(pageSize = 0, initialLoadSize = 0)
    ) {
        MeliDataSource(repo = repositoryRemote, product = productBySearch)
    }.flow)

    init {
        getCategories()
    }

    fun getProduct(product: String) {
        productBySearch = product
        resultPager = Pager(
            PagingConfig(pageSize = 50, initialLoadSize = 50)
        ) {
            MeliDataSource(repo = repositoryRemote, product = productBySearch)
        }.flow.cachedIn(viewModelScope)
    }

    private fun getCategories() {
        viewModelScope.launch {
            isLoading = true
            meliUseCases.getCategoriesUseCase()
                .onSuccess {
                    isLoading = false
                    categories = it
                }.onFailure {
                    isLoading = false
                    val errorCode = it.message ?: EMPTY
                    Log.e("error_category", errorCode)
                    return@onFailure
                }
        }
    }
}