package com.andres.mercadolibre.domain.model.search

data class SellerReputation(
    val level_id: Any = Any(),
    val metrics: Metrics = Metrics(),
    val power_seller_status: Any = Any(),
    val transactions: Transactions = Transactions()
)