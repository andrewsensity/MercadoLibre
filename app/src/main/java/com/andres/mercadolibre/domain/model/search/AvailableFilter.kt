package com.andres.mercadolibre.domain.model.search

data class AvailableFilter(
    val id: String,
    val name: String,
    val type: String,
    val values: List<Value>
)