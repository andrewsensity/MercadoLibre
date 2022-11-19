package com.andres.mercadolibre.domain.model.search

data class Filter(
    val id: String,
    val name: String,
    val type: String,
    val values: List<ValueX>
)