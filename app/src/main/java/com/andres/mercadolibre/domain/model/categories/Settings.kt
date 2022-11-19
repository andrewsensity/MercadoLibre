package com.andres.mercadolibre.domain.model.categories

data class Settings(
    val identification_types: List<String> = emptyList(),
    val identification_types_rules: Any = Any(),
    val taxpayer_types: List<Any> = emptyList()
)