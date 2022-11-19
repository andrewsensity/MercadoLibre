package com.andres.mercadolibre.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.andres.mercadolibre.ui.navigation.MeliNavHost
import com.andres.mercadolibre.ui.theme.MercadoLibreTheme
import com.andres.mercadolibre.ui.theme.Yellow
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            rememberSystemUiController().setSystemBarsColor(Yellow)
            MercadoLibreTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MeliNavHost()
                }
            }
        }
    }
}