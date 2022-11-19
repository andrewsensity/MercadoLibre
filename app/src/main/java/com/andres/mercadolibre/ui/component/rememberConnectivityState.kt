package com.andres.mercadolibre.ui.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.produceState
import androidx.compose.ui.platform.LocalContext
import com.andres.mercadolibre.util.ConnectionState
import com.andres.mercadolibre.util.Util.currentConnectivityState
import com.andres.mercadolibre.util.Util.observeConnectivityAsFlow
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Composable
fun rememberConnectivityState(): State<ConnectionState> {
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