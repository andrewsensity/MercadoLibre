package com.andres.mercadolibre.util

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import com.google.gson.Gson
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.callbackFlow
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.text.DecimalFormat
import java.util.*

object Util {
    fun <A> String.fromJson(type: Class<A>): A = Gson().fromJson(this, type)
    fun <A> A.toJson(): String? = Gson().toJson(this)

    val Context.currentConnectivityState: ConnectionState
        get() {
            val connectivityManager =
                getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            return getCurrentConnectivityState(connectivityManager)
        }

    private fun getCurrentConnectivityState(
        connectivityManager: ConnectivityManager,
    ): ConnectionState {
        val connected = connectivityManager.allNetworks.any { network ->
            connectivityManager.getNetworkCapabilities(network)
                ?.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
                ?: false
        }

        return if (connected) ConnectionState.Available else ConnectionState.Unavailable
    }

    @ExperimentalCoroutinesApi
    fun Context.observeConnectivityAsFlow() = callbackFlow {
        val connectivityManager =
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val callback = networkCallback { connectionState -> trySend(connectionState) }

        val networkRequest = NetworkRequest.Builder()
            .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
            .build()
        connectivityManager.registerNetworkCallback(networkRequest, callback)
        val currentState = getCurrentConnectivityState(connectivityManager)
        trySend(currentState)
        awaitClose {
            connectivityManager.unregisterNetworkCallback(callback)
        }
    }

    fun readJsonFile(fileName: String): String {
        var inputStream: InputStream? = null
        try {
            inputStream = javaClass.classLoader?.getResourceAsStream(fileName)
            val builder = StringBuilder()
            val reader = BufferedReader(InputStreamReader(inputStream))
            var str: String? = reader.readLine()
            while (str != null) {
                builder.append(str)
                str = reader.readLine()
            }
            return builder.toString()
        } finally {
            inputStream?.close()
        }
    }

    fun networkCallback(callback: (ConnectionState) -> Unit): ConnectivityManager.NetworkCallback {
        return object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                callback(ConnectionState.Available)
            }

            override fun onLost(network: Network) {
                callback(ConnectionState.Unavailable)
            }
        }
    }

    fun Int.formatMoney(): String {
        val locale = Locale.getDefault()
        val format = DecimalFormat.getCurrencyInstance()
        format.maximumFractionDigits = 0
        format.currency = Currency.getInstance(locale)
        return format.format(this).replace(',', '.')
    }
}