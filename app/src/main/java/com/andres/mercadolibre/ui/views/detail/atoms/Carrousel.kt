package com.andres.mercadolibre.ui.views.detail.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.andres.mercadolibre.R
import com.andres.mercadolibre.ui.theme.Gray
import com.andres.mercadolibre.ui.views.detail.DetailViewModel
import com.andres.mercadolibre.util.Constants
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.pagerTabIndicatorOffset

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Carrousel(
    pagerState: PagerState,
    pages: Int,
    pictures: MutableList<String>,
    detailViewModel: DetailViewModel
) {
    val context = LocalContext.current
    val placeholderImage = R.drawable.ic_default_avatar
    Box(
        modifier = Modifier
            .height(300.dp)
            .fillMaxWidth(),
        contentAlignment = Alignment.TopStart
    ) {
        HorizontalPager(
            count = pages,
            state = pagerState,
            modifier = Modifier
        ) {
            val imageRequest = ImageRequest.Builder(context)
                .data(pictures[pagerState.currentPage])
                .error(placeholderImage)
                .build()
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                AsyncImage(
                    model = imageRequest,
                    contentDescription = Constants.EMPTY,
                    modifier = Modifier.size(400.dp),
                    contentScale = ContentScale.Fit
                )
            }
        }
        TabRow(
            selectedTabIndex = pagerState.currentPage,
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(
                    Modifier.pagerTabIndicatorOffset(pagerState, tabPositions)
                )
            },
            divider = {
                TabRowDefaults.Divider(
                    color = Color.Transparent
                )
            },
            contentColor = Color.Transparent,
            backgroundColor = Color.Transparent,
            modifier = Modifier.width(100.dp)
        ) {
            Box(modifier = Modifier
                .padding(20.dp)
                .background(color = Gray, shape = CircleShape)
            ) {
                Text(
                    text = "${pagerState.currentPage + 1} / ${detailViewModel.lengthList}",
                    fontSize = 12.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp, vertical = 4.dp),
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )
            }
        }
    }
}