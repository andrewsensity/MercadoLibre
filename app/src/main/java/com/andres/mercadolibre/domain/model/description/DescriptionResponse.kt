package com.andres.mercadolibre.domain.model.description

data class DescriptionResponse(
    val date_created: String = "",
    val last_updated: String = "",
    val plain_text: String = "",
    val snapshot: Snapshot = Snapshot(),
    val text: String = ""
)