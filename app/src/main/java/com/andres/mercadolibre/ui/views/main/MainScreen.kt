package com.andres.mercadolibre.ui.views.main

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemsIndexed
import com.andres.mercadolibre.R
import com.andres.mercadolibre.domain.model.search.Result
import com.andres.mercadolibre.ui.component.CustomAppBar
import com.andres.mercadolibre.ui.component.CustomLoading
import com.andres.mercadolibre.ui.component.CustomSnackBarNetwork
import com.andres.mercadolibre.ui.theme.Yellow
import com.andres.mercadolibre.ui.views.main.atoms.HeaderMain
import com.andres.mercadolibre.ui.views.main.atoms.ListContent
import com.andres.mercadolibre.ui.views.main.atoms.itemCategories
import com.andres.mercadolibre.util.ConnectionState
import com.andres.mercadolibre.util.Constants.EMPTY
import com.andres.mercadolibre.util.connectivityState

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun MainScreen(
    navController: NavController,
    mainViewModel: MainViewModel = hiltViewModel(),
) {
    var showText by rememberSaveable { mutableStateOf(false) }
    val keyboardController = LocalSoftwareKeyboardController.current
    val context = LocalContext.current
    val categories = mutableListOf<String>()
    var onClick by remember { mutableStateOf(false) }
    var searchFromCategories by remember { mutableStateOf("") }
    val connection by connectivityState()
    val isConnected = connection != ConnectionState.Available
    val resultList: LazyPagingItems<Result> = mainViewModel.resultPager.collectAsLazyPagingItems()
    mainViewModel.categories.categories.forEach { categories.add(it.name) }
    Scaffold(
        topBar = {
            CustomAppBar(
                navController = navController,
                contentDescriptionTopBar = EMPTY,
                content = {
                    keyboardController?.let { keyboardController ->
                        HeaderMain(
                            mainViewModel = mainViewModel,
                            showText = { show -> showText = show },
                            keyboardController = keyboardController,
                            showIcon = showText,
                            onClick = onClick,
                            context = context,
                            clearFocus = { onClick = it },
                            searchFromCategories = searchFromCategories,
                            emptySearch = { searchFromCategories = it },
                        )
                    }
                }
            )
        },
        contentColor = Yellow,
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AnimatedVisibility(visible = showText) {
                LazyColumn(
                    contentPadding = PaddingValues(10.dp)
                ) {
                    itemsIndexed(resultList) { index, products ->
                        products?.let { product ->
                            ListContent(
                                context = context,
                                products = product,
                                index = index,
                                showText = { show -> showText = show },
                                navController = navController
                            )
                        }
                        /*when (resultList.loadState.append) {
                            is LoadState.NotLoading -> Unit
                            LoadState.Loading -> {
                                item {
                                    LoadingItem()
                                }
                            }
                            is LoadState.Error -> {
                                item {
                                    ErrorItem(message = "Some error occurred")
                                }
                            }
                        }

                        when (resultList.loadState.refresh) {
                            is LoadState.NotLoading -> Unit
                            LoadState.Loading -> {
                                item {
                                    Box(
                                        modifier = Modifier.fillMaxSize(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        CircularProgressIndicator()
                                    }
                                }
                            }
                            is LoadState.Error ->{}
                        }*/
                    }
                }
            }
            if (!showText) {
                LazyColumn(
                    contentPadding = PaddingValues(vertical = 10.dp)
                ) {
                    itemsIndexed(categories) { index, category ->
                        keyboardController?.let { keyboard ->
                            itemCategories(
                                index = index,
                                category = category,
                                onClick = { click -> onClick = click },
                                product = { product -> searchFromCategories = product },
                                mainViewModel = mainViewModel,
                                keyboardController = keyboard,
                                clearFocus = { clear -> onClick = clear },
                                showText = { show -> showText = show }
                            )
                        }
                    }
                }
            }
        }
    }
    CustomLoading(context, mainViewModel.isLoading)
    CustomSnackBarNetwork(
        showSnackBar = isConnected,
        context = context,
        title = context.getString(R.string.connection_title),
        description = context.getString(R.string.connection_description),
        contentDescription = EMPTY
    )
}

@Composable
fun LoadingItem() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            modifier = Modifier
                .width(42.dp)
                .height(42.dp)
                .padding(8.dp),
            strokeWidth = 5.dp
        )

    }
}

@Composable
fun ErrorItem(message: String) {
    Card(
        elevation = 2.dp,
        modifier = Modifier
            .padding(6.dp)
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .padding(8.dp)
        ) {
            Image(
                modifier = Modifier
                    .clip(CircleShape)
                    .width(42.dp)
                    .height(42.dp),
                painter = painterResource(id = R.drawable.ic_error),
                contentDescription = "",
                colorFilter = ColorFilter.tint(Color.White)
            )
            Text(
                color = Color.White,
                text = message,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(start = 12.dp)
                    .align(Alignment.CenterVertically)
            )
        }
    }
}
