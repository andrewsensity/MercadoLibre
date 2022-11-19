package com.andres.mercadolibre.ui.views.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.andres.mercadolibre.R
import com.andres.mercadolibre.domain.model.search.Result
import com.andres.mercadolibre.ui.component.CustomAppBar
import com.andres.mercadolibre.ui.component.CustomLoading
import com.andres.mercadolibre.ui.component.CustomSnackBarNetwork
import com.andres.mercadolibre.ui.component.rememberModalBottomSheet
import com.andres.mercadolibre.ui.theme.Yellow
import com.andres.mercadolibre.ui.views.detail.atoms.*
import com.andres.mercadolibre.util.ConnectionState
import com.andres.mercadolibre.util.Constants.EMPTY
import com.andres.mercadolibre.util.Constants.ITEM_CONDITION
import com.andres.mercadolibre.util.connectivityState
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class, ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@Composable
fun DetailScreen(
    id: String,
    detailViewModel: DetailViewModel = hiltViewModel(),
    result: Result,
    navController: NavController,
) {
    LaunchedEffect(key1 = true) {
        detailViewModel.getDetails(id)
        detailViewModel.getDescription(id)
    }
    val context = LocalContext.current
    val connection by connectivityState()
    val isConnected = connection != ConnectionState.Available
    val detail = detailViewModel.detail
    val description = detailViewModel.description
    val pictures = mutableListOf<String>()
    val pagerState = rememberPagerState(initialPage = 0)
    var itemCondition = ""
    val pages = detailViewModel.lengthList
    val confirmStateChange by remember { mutableStateOf(true) }
    var quantity by rememberSaveable { mutableStateOf(EMPTY) }
    var cartNumber by rememberSaveable { mutableStateOf(EMPTY) }
    val sheetState = rememberModalBottomSheet(confirmStateChange = { confirmStateChange })
    val scope = rememberCoroutineScope()
    var typeModalBottomSheet: BottomSheetContent by remember {
        mutableStateOf(BottomSheetContent.SelectQuantity)
    }
    detail.pictures.forEach { picture ->
        pictures.add(picture.url)
    }
    detail.attributes.forEach {
        if (it.id == ITEM_CONDITION) itemCondition = it.value_name
    }
    ModalBottomSheetLayout(
        sheetState = sheetState,
        sheetContent = {
            ModalContent(
                quantity = { quantity = it },
                sheetState = sheetState,
                scope = scope,
                modalBottomSheetState = typeModalBottomSheet,
                typeModal = { typeModalBottomSheet = it },
                initialQuantity = detail.initial_quantity
            )
        },
        sheetShape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp)
    ) {
        Scaffold(
            topBar = {
                CustomAppBar(
                    navController = navController,
                    contentDescriptionTopBar = EMPTY,
                ) {
                    HeaderDetails(quantit = cartNumber)
                }
            },
            contentColor = Yellow,
        ) {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(it)
                    .padding(15.dp),
            ) {
                Header(
                    itemCondition = itemCondition,
                    detail = detail,
                    result = result
                )
                Carrousel(
                    pagerState = pagerState,
                    pages = pages,
                    pictures = pictures,
                    detailViewModel = detailViewModel
                )
                PricesShipping(result = result)
                Shipping()
                AvailableStock(
                    context = context,
                    sheetState = sheetState,
                    quantit = quantity,
                    cart = { cart -> cartNumber = cart },
                    availableQuantity = detail.initial_quantity
                )
                SellerInfo(
                    location = detail.seller_address,
                    detail = detail
                )
                Description(description = description)
            }
        }
    }
    CustomLoading(context, detailViewModel.isLoading)
    CustomSnackBarNetwork(
        showSnackBar = isConnected,
        context = context,
        title = context.getString(R.string.connection_title),
        description = context.getString(R.string.connection_description),
        contentDescription = EMPTY
    )
}