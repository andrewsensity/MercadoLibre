package com.andres.mercadolibre.domain.model.search

data class Metrics(
    val cancellations: Cancellations = Cancellations(),
    val claims: Claims = Claims(),
    val delayed_handling_time: DelayedHandlingTime = DelayedHandlingTime(),
    val sales: Sales = Sales()
)