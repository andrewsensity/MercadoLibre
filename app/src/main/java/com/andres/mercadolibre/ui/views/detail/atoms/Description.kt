package com.andres.mercadolibre.ui.views.detail.atoms

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andres.mercadolibre.R
import com.andres.mercadolibre.domain.model.description.DescriptionResponse

@Composable
fun Description(description: DescriptionResponse) {
    Text(
        text = stringResource(R.string.description),
        fontSize = 16.sp,
        modifier = Modifier.padding(vertical = 20.dp),
        color = Color.Black
    )
    Text(
        text = description.plain_text,
        fontSize = 14.sp,
        lineHeight = 14.sp,
        color = Color.Black
    )
}