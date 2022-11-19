package com.andres.mercadolibre.domain.model.search

data class ValueX(
    val id: String,
    val name: String,
    val path_from_root: List<PathFromRoot>
)