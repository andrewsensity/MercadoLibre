package com.andres.mercadolibre.domain.use_case

data class MeliUseCases(
    val getDetailUseCase: GetDetailUseCase,
    val getDescriptionUseCase: GetDescriptionUseCase,
    val getBySearchUseCase: GetBySearchUseCase,
    val getCategoriesUseCase: GetCategoriesUseCase
)