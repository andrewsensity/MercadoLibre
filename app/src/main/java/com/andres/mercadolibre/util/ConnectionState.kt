package com.andres.mercadolibre.util

sealed class ConnectionState {
    object Available : ConnectionState()
    object Unavailable : ConnectionState()
}