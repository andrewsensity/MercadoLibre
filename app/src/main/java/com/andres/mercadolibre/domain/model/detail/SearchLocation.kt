package com.andres.mercadolibre.domain.model.detail

data class SearchLocation(
    val city: City = City(),
    val state: State = State()
)