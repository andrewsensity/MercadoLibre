package com.andres.mercadolibre.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.produceState
import androidx.compose.ui.platform.LocalContext
import com.andres.mercadolibre.util.Util.currentConnectivityState
import com.andres.mercadolibre.util.Util.observeConnectivityAsFlow

@Composable
fun connectivityState(): State<ConnectionState> {
    val context = LocalContext.current
    return produceState(initialValue = context.currentConnectivityState) {
        try {
            context.observeConnectivityAsFlow().collect {
                value = it
            }
        } catch (exception: Exception) {
            exception.printStackTrace()
        }
    }
}