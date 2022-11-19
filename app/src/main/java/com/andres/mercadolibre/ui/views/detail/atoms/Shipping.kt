package com.andres.mercadolibre.ui.views.detail.atoms

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.LocalShipping
import androidx.compose.material.icons.outlined.Store
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.andres.mercadolibre.R

@Composable
fun Shipping() {
    CustomShipAndShop(
        text1 = stringResource(R.string.arrive),
        text2 = stringResource(R.string.day),
        text3 = stringResource(R.string.price_shipping),
        text4 = stringResource(R.string.other_shipping),
        icon = Icons.Outlined.LocalShipping
    )
    CustomShipAndShop(
        text1 = stringResource(R.string.pickup),
        text2 = stringResource(R.string.from_day),
        text3 = stringResource(R.string.meli_agency),
        text4 = stringResource(R.string.show_in_map),
        icon = Icons.Outlined.Store
    )
}