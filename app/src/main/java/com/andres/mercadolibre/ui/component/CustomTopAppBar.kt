package com.andres.mercadolibre.ui.component

import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.andres.mercadolibre.ui.theme.Yellow

@Composable
fun CustomTopAppBar(
    navController: NavController,
    changeAppearance: Boolean = false,
    contentDescription: String,
) {
    TopAppBar(
        title = {},
        navigationIcon = customNavigationIcon(
            navController = navController,
            contentDescription = contentDescription
        ),
        elevation = 0.dp,
        backgroundColor = if (changeAppearance) Color.Transparent else Yellow
    )
}