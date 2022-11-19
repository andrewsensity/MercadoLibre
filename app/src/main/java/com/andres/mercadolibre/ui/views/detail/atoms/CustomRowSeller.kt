package com.andres.mercadolibre.ui.views.detail.atoms

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andres.mercadolibre.util.Constants

@Composable
fun CustomRowSeller(
    color: Color = Color.Black,
    text1: String,
    text2: String,
    icon: ImageVector,
) {
    Spacer(modifier = Modifier.height(20.dp))
    Row {
        Icon(
            imageVector = icon,
            contentDescription = Constants.EMPTY,
            tint = color
        )
        Column(
            modifier = Modifier.padding(start = 8.dp)) {
            Text(
                text = text1,
                fontSize = 14.sp,
                lineHeight = 14.sp,
                color = color,
                fontWeight = FontWeight.SemiBold,
            )
            Text(
                text = text2,
                fontSize = 12.sp,
                color = Color.Black,
                fontWeight = FontWeight.Normal,
            )
        }
    }
}