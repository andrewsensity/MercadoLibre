package com.andres.mercadolibre.ui.component

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun CustomIconButton(
    modifier: Modifier = Modifier,
    icon: Int,
    contentDescription: String,
    onClick: () -> Unit,
) {
    IconButton(
        onClick = onClick
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = contentDescription,
            modifier = modifier,
            tint = Color.White
        )
    }
}