package com.andres.mercadolibre.ui.views.detail.atoms

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material.icons.outlined.WorkspacePremium
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andres.mercadolibre.R
import com.andres.mercadolibre.domain.model.detail.DetailResponse
import com.andres.mercadolibre.domain.model.detail.SellerAddress
import com.andres.mercadolibre.ui.theme.Green

@Composable
fun SellerInfo(
    location: SellerAddress,
    detail: DetailResponse
) {
    Text(
        text = stringResource(R.string.seller_info),
        fontSize = 16.sp,
        modifier = Modifier.padding(top = 20.dp),
        color = Color.Black
    )
    CustomRowSeller(
        text1 = stringResource(R.string.location),
        text2 = location.city.name,
        icon = Icons.Outlined.Place
    )
    CustomRowSeller(
        color = Green,
        text1 = stringResource(R.string.level),
        text2 = stringResource(R.string.score),
        icon = Icons.Outlined.WorkspacePremium
    )
    RowScore(detail = detail)
    ScoreSeller(detail = detail)
}