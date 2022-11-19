package com.andres.mercadolibre.ui.views.detail.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.andres.mercadolibre.domain.model.detail.DetailResponse
import com.andres.mercadolibre.ui.theme.listColor

@Composable
fun RowScore(detail: DetailResponse) {
    Spacer(modifier = Modifier.height(30.dp))
    BoxWithConstraints(
        modifier = Modifier.fillMaxWidth()
    ) {
        val boxes = 5
        val space = (maxWidth - 32.dp) / boxes
        val quantity = when(detail.sold_quantity) {
            in 0..20  -> 0
            in 21..40 -> 1
            in 41..60 -> 2
            in 61..80 -> 3
            else      -> 4
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(times = boxes) { index ->
                val stroke = if (index == quantity) 10.dp else 6.dp
                Box(
                    modifier = Modifier
                        .background(listColor[index])
                        .height(stroke)
                        .width(space)
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
    }
}