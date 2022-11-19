package com.andres.mercadolibre.ui.views.detail

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andres.mercadolibre.domain.model.description.DescriptionResponse
import com.andres.mercadolibre.domain.model.detail.DetailResponse
import com.andres.mercadolibre.domain.use_case.MeliUseCases
import com.andres.mercadolibre.util.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val meliUseCases: MeliUseCases
) : ViewModel() {

    var detail by mutableStateOf(DetailResponse())
        private set
    var isLoading by mutableStateOf(false)
        private set
    var lengthList by mutableStateOf(0)
        private set
    var description by mutableStateOf(DescriptionResponse())
        private set

    fun getDetails(id: String) {
        viewModelScope.launch {
            isLoading = true
            meliUseCases.getDetailUseCase(id)
                .onSuccess {
                    isLoading = false
                    detail = it
                    lengthList = it.pictures.size
                }.onFailure {
                    isLoading = false
                    val errorCode = it.message ?: Constants.EMPTY
                    Log.e("error_detail", errorCode)
                    return@onFailure
                }
        }
    }

    fun getDescription(id: String) {
        viewModelScope.launch {
            isLoading = true
            meliUseCases.getDescriptionUseCase(id)
                .onSuccess {
                    isLoading = false
                    description = it
                }.onFailure {
                    isLoading = false
                    val errorCode = it.message ?: Constants.EMPTY
                    Log.e("error_description", errorCode)
                    return@onFailure
                }
        }
    }
}