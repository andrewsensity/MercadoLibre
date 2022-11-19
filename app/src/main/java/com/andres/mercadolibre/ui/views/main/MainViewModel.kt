package com.andres.mercadolibre.ui.views.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andres.mercadolibre.domain.model.detail.DetailResponse
import com.andres.mercadolibre.domain.model.categories.CategoriesResponse
import com.andres.mercadolibre.domain.model.description.DescriptionResponse
import com.andres.mercadolibre.domain.model.search.SearchResponse
import com.andres.mercadolibre.domain.use_case.MeliUseCases
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
                    val result = searchResponse.results
                    val list = mutableListOf<String>()
                    var id by mutableStateOf("")
                    result.forEach{ list.add(it.id) }
                    list.let { id = it[0] }
                }.onFailure {
                    isLoading = false
                    val errorCode = it.cause
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
                    val errorCode = it.cause
                    return@onFailure
                }
        }
    }
}