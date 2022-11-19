package com.andres.mercadolibre.ui.views.main

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.andres.mercadolibre.R
import com.andres.mercadolibre.ui.component.CustomAppBar
import com.andres.mercadolibre.ui.component.CustomLoading
import com.andres.mercadolibre.ui.component.CustomSnackBarNetwork
import com.andres.mercadolibre.ui.theme.Yellow
import com.andres.mercadolibre.ui.views.main.atoms.HeaderMain
import com.andres.mercadolibre.ui.views.main.atoms.ListCategories
import com.andres.mercadolibre.ui.views.main.atoms.ListContent
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
    val connection by connectivityState()
    val isConnected = connection != ConnectionState.Available
    mainViewModel.categories.categories.forEach { categories.add(it.name) }
    Scaffold(
        topBar = {
            CustomAppBar(
                navController = navController,
                contentDescriptionTopBar = EMPTY
            ) {
                keyboardController?.let { keyboardController ->
                    HeaderMain(
                        mainViewModel = mainViewModel,
                        showText = { show -> showText = show },
                        keyboardController = keyboardController,
                        showIcon = showText,
                        onClick = onClick,
                        context = context,
                        clearFocus = { onClick = it }
                    )
                }
            }
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
                    itemsIndexed(mainViewModel.search.results) { index, products ->
                        ListContent(
                            context = context,
                            products = products,
                            index = index,
                            showText = { showText = it },
                            navController = navController
                        )
                    }
                }
            }
            if (!showText) {
                LazyColumn(
                    contentPadding = PaddingValues(vertical = 10.dp)
                ) {
                    itemsIndexed(categories) { index, category ->
                        ListCategories(
                            context = context,
                            index = index,
                            category = category,
                            onClick = { onClick = it }
                        )
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
