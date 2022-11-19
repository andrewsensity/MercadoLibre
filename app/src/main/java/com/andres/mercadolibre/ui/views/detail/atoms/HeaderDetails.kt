package com.andres.mercadolibre.ui.views.detail.atoms

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.andres.mercadolibre.R
import com.andres.mercadolibre.util.Constants.EMPTY

@Composable
fun HeaderDetails() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Row() {
            Row(
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Outlined.FavoriteBorder,
                        contentDescription = EMPTY,
                        tint = Color.Black
                    )
                }
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Outlined.Search,
                        contentDescription = EMPTY,
                        tint = Color.Black
                    )
                }
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Outlined.ShoppingCart,
                        contentDescription = EMPTY,
                        tint = Color.Black
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Outlined.LocationOn,
                contentDescription = EMPTY,
                modifier = Modifier.size(16.dp),
                tint = Color.Black
            )
            Text(
                text = stringResource(R.string.user_address),
                maxLines = 1,
                style = MaterialTheme.typography.bodySmall,
                color = Color.Black,
                overflow = TextOverflow.Ellipsis
            )
            Icon(
                imageVector = Icons.Outlined.KeyboardArrowRight,
                contentDescription = EMPTY,
                modifier = Modifier.size(16.dp),
                tint = Color.Black
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
    }
}