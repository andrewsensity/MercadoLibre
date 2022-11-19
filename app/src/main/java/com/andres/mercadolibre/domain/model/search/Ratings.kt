package com.andres.mercadolibre.domain.model.search

data class Ratings(
    val negative: Int = 0,
    val neutral: Int = 0,
    val positive: Int = 0
)