package com.andres.mercadolibre.ui.views.detail.atoms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.andres.mercadolibre.util.Constants.EMPTY

@Composable
fun ItemScore(
    isIcon: Boolean,
    icon: ImageVector,
    description: String,
    title: String = EMPTY,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if (isIcon) {
            Icon(imageVector = icon, contentDescription = EMPTY, tint = Color.Black)
        } else {
            Text(text = title, color = Color.Black, fontSize = 20.sp)
        }
        Text(
            text = description,
            color = Color.Black,
            fontSize = 10.sp,
            lineHeight = 10.sp,
            textAlign = TextAlign.Center
        )
    }
}