package com.andres.mercadolibre.ui.component

import androidx.compose.foundation.layout.offset
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController

@Composable
fun customNavigationIcon(
    navController: NavController,
    contentDescription: String,
): @Composable (() -> Unit)? {
    val previousBackStackEntry: NavBackStackEntry? by navController.previousBackStackEntryAsState()
    return previousBackStackEntry?.let {
        {
            IconButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.offset(y = 4.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = contentDescription,
                    tint = Black
                )
            }
        }
    }
}