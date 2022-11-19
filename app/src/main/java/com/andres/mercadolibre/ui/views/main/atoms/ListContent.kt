package com.andres.mercadolibre.ui.views.main.atoms

import android.content.Context
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.RoundedCornersTransformation
import com.andres.mercadolibre.R
import com.andres.mercadolibre.domain.model.search.Result
import com.andres.mercadolibre.ui.navigation.Screen
import com.andres.mercadolibre.ui.theme.Gray
import com.andres.mercadolibre.ui.theme.Green
import com.andres.mercadolibre.util.Constants
import com.andres.mercadolibre.util.Constants.LOGISTIC_TYPE
import com.andres.mercadolibre.util.Util.formatMoney
import com.andres.mercadolibre.util.Util.toJson

@Composable
fun ListContent(
    context: Context,
    products: Result,
    index: Int,
    showText: (Boolean) -> Unit,
    navController: NavController,
) {
    val url = products.thumbnail
    val placeholderImage = R.drawable.ic_default_avatar
    val imageRequest = ImageRequest.Builder(context)
        .data(url)
        .placeholder(placeholderImage)
        .error(placeholderImage)
        .transformations(RoundedCornersTransformation())
        .build()
    if (index != 0) Divider()
    Spacer(modifier = Modifier.height(8.dp))
    Row(
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                showText(true)
                navController.navigate(
                    "${Screen.DetailScreen.route}?${Constants.ID_PARAMETER}=${products.id}&${Constants.RESULT}=${products.toJson()}"
                )
            },
        verticalAlignment = Alignment.Top
    ) {
        Card(
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Gray
            )
        ) {
            AsyncImage(
                model = imageRequest,
                contentDescription = Constants.EMPTY,
                modifier = Modifier.size(140.dp),
            )
        }
        Column {
            Text(
                text = products.title,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                color = Color.Black,
                lineHeight = 14.sp
            )
            Text(
                text = products.price.formatMoney(),
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
                color = Color.Black
            )
            AnimatedVisibility(visible = products.shipping.free_shipping) {
                Text(
                    text = stringResource(R.string.free_shipping),
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Normal,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    color = Green
                )
            }
            AnimatedVisibility(visible = products.shipping.logistic_type == LOGISTIC_TYPE) {
                Box(
                    modifier = Modifier
                        .padding(vertical = 4.dp)
                        .background(Green.copy(alpha = 0.1f)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = stringResource(R.string.arrive_tomorrow),
                        color = Green,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(4.dp)
                    )
                }
            }
            Text(
                text = products.seller_address.state.name,
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
                color = Color.Black
            )
        }
    }
    Spacer(modifier = Modifier.height(8.dp))
}