package com.andres.mercadolibre.ui.views.detail.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ChatBubbleOutline
import androidx.compose.material.icons.outlined.Timer
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.andres.mercadolibre.R
import com.andres.mercadolibre.domain.model.detail.DetailResponse

@Composable
fun ScoreSeller(detail: DetailResponse) {
    Spacer(modifier = Modifier.height(20.dp))
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        ItemScore(
            icon = Icons.Outlined.ChatBubbleOutline,
            isIcon = false,
            title = detail.sold_quantity.toString(),
            description = stringResource(id = R.string.sold_quantity),
        )
        Box(
            modifier = Modifier
                .background(Color.Black)
                .width(1.dp)
                .height(50.dp)
        )
        ItemScore(
            icon = Icons.Outlined.ChatBubbleOutline,
            isIcon = true,
            description = stringResource(id = R.string.good_attention)
        )
        Box(
            modifier = Modifier
                .background(Color.Black)
                .width(1.dp)
                .height(50.dp)
        )
        ItemScore(
            icon = Icons.Outlined.Timer,
            isIcon = true,
            description = stringResource(id = R.string.arrive_on_time)
        )
    }
    Divider(modifier = Modifier.padding(top = 30.dp))
}