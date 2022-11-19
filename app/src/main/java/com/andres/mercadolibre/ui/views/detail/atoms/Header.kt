package com.andres.mercadolibre.ui.views.detail.atoms

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andres.mercadolibre.domain.model.detail.DetailResponse
import com.andres.mercadolibre.domain.model.search.Result

@Composable
fun Header(
    itemCondition: String,
    detail: DetailResponse,
    result: Result
) {
    Spacer(modifier = Modifier.padding(top = 6.dp))
    Text(
        text = "$itemCondition | ${detail.sold_quantity} vendidos",
        fontSize = 12.sp,
        fontWeight = FontWeight.Light,
        modifier = Modifier,
        color = Color.Black
    )
    Text(
        text = result.title,
        fontSize = 14.sp,
        lineHeight = 14.sp,
        fontWeight = FontWeight.Normal,
        modifier = Modifier.padding(bottom = 18.dp, top = 6.dp),
        color = Color.Black
    )
}