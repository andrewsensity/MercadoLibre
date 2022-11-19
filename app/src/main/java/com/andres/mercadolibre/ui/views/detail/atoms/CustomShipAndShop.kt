package com.andres.mercadolibre.ui.views.detail.atoms

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andres.mercadolibre.R
import com.andres.mercadolibre.ui.theme.Blue50
import com.andres.mercadolibre.ui.theme.Green
import com.andres.mercadolibre.util.Constants

@Composable
fun CustomShipAndShop(
    text1: String,
    text2: String,
    text3: String,
    text4: String,
    icon: ImageVector,
) {
    Spacer(modifier = Modifier.height(10.dp))
    Row(verticalAlignment = Alignment.Top) {
        Icon(imageVector = icon, contentDescription = Constants.EMPTY, tint = Green)
        Column(Modifier.padding(start = 8.dp)) {
            Text(
                text = buildAnnotatedString {
                    append(text1)
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append(text2)
                    }
                    withStyle(style = SpanStyle(fontSize = 14.sp)) {
                        append(text3)
                    }
                },
                fontSize = 12.sp,
                lineHeight = 14.sp,
                color = Green
            )
            Text(
                text = buildAnnotatedString {
                    append(stringResource(R.string.shop_soon))
                    withStyle(style = SpanStyle(fontSize = 14.sp)) {
                        append(stringResource(R.string.time_reversed))
                    }
                },
                fontSize = 12.sp,
                color = Color.Black
            )
            Text(
                text = stringResource(R.string.profit_meli_points),
                fontSize = 12.sp,
                color = Color.Black
            )
            Text(
                text = text4,
                fontSize = 12.sp,
                color = Blue50
            )
        }
    }
}