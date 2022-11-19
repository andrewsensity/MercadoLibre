package com.andres.mercadolibre.domain.model.search

data class ReferencePrice(
    val amount: Double,
    val conditions: ConditionsX,
    val currency_id: String,
    val exchange_rate_context: String,
    val id: String,
    val last_updated: String,
    val tags: List<Any>,
    val type: String
)