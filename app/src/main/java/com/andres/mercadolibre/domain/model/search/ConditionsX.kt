package com.andres.mercadolibre.domain.model.search

data class ConditionsX(
    val context_restrictions: List<String>,
    val eligible: Boolean,
    val end_time: Any,
    val start_time: Any
)