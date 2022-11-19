package com.andres.mercadolibre.ui.views.detail.atoms

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andres.mercadolibre.R
import com.andres.mercadolibre.domain.model.search.Result
import com.andres.mercadolibre.ui.theme.Blue50
import com.andres.mercadolibre.util.Util.formatMoney

@Composable
fun PricesShipping(result: Result) {
    Text(
        text = result.price.formatMoney(),
        fontSize = 32.sp,
        modifier = Modifier.padding(top = 35.dp, bottom = 20.dp),
        fontWeight = FontWeight.Light,
        color = Color.Black
    )
    Text(
        text = stringResource(R.string.fees),
        fontSize = 16.sp,
        modifier = Modifier.padding(bottom = 2.dp, start = 20.dp),
        color = Color.Black
    )
    Text(
        text = stringResource(R.string.more_info),
        fontSize = 14.sp,
        modifier = Modifier.padding(bottom = 12.dp, start = 20.dp),
        color = Blue50
    )
}