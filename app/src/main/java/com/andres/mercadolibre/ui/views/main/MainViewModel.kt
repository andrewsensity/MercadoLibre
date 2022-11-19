package com.andres.mercadolibre.ui.views.main

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andres.mercadolibre.domain.model.categories.CategoriesResponse
import com.andres.mercadolibre.domain.model.search.SearchResponse
import com.andres.mercadolibre.domain.use_case.MeliUseCases
import com.andres.mercadolibre.util.Constants.EMPTY
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val meliUseCases: MeliUseCases,
) : ViewModel() {

    var search by mutableStateOf(SearchResponse())
        private set
    var categories by mutableStateOf(CategoriesResponse())
        private set
    var isLoading by mutableStateOf(false)
        private set

    init {
        getCategories()
    }

    fun getBySearch(product: String) {
        viewModelScope.launch {
            isLoading = true
            meliUseCases.getBySearchUseCase(product)
                .onSuccess { searchResponse ->
                    isLoading = false
                    search = searchResponse
                }.onFailure {
                    isLoading = false
                    val errorCode = it.message ?: EMPTY
                    Log.e("error_search", errorCode)
                    return@onFailure
                }
        }
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