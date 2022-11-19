package com.andres.mercadolibre.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.andres.mercadolibre.ui.theme.Yellow

@Composable
fun CustomAppBar(
    navController: NavController,
    modifier: Modifier = Modifier,
    contentDescriptionTopBar: String,
    content: @Composable () -> Unit,
) {
    Box(modifier = modifier
        .fillMaxWidth()
        .background(color = Yellow)
    ) {
        CustomTopAppBar(
            navController = navController,
            changeAppearance = true,
            contentDescription = contentDescriptionTopBar
        )
        content()
    }
}