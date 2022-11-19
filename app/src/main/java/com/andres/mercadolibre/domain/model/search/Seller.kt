package com.andres.mercadolibre.domain.model.search

data class Seller(
    val car_dealer: Boolean = false,
    val id: Int = 0,
    val permalink: String = "",
    val real_estate_agency: Boolean = false,
    val registration_date: String = "",
    val seller_reputation: SellerReputation = SellerReputation(),
    val tags: List<String> = emptyList()
)