package com.andres.mercadolibre.domain.model.search

data class DelayedHandlingTime(
    val period: String = "",
    val rate: Int = 0,
    val value: Int = 0
)