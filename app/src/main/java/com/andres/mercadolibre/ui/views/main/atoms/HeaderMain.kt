package com.andres.mercadolibre.ui.views.main.atoms

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.SoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.andres.mercadolibre.R
import com.andres.mercadolibre.ui.views.main.InputField
import com.andres.mercadolibre.ui.views.main.MainViewModel
import com.andres.mercadolibre.util.Constants.EMPTY

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun HeaderMain(
    mainViewModel: MainViewModel,
    showText: (Boolean) -> Unit,
    keyboardController: SoftwareKeyboardController,
    showIcon: Boolean = false,
    onClick: Boolean,
    context: Context,
    clearFocus: (Boolean) -> Unit
) {
    val (search, onChangeSearch) = rememberSaveable { mutableStateOf(EMPTY) }
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            if (showIcon) {
                IconButton(
                    onClick = {
                        onChangeSearch(EMPTY)
                        showText(false)
                    },
                    modifier = Modifier.offset(x = 4.3.dp)
                ) {
                    Icon(
                        imageVector = Icons.Outlined.ArrowBack,
                        contentDescription = EMPTY,
                        tint = Color.Black
                    )
                }
            }
            CustomTextField(
                search = search,
                onChangeSearch = onChangeSearch,
                modifier = Modifier
                    .padding(
                        start = if (showIcon) 0.dp else 12.dp,
                        end = if (showIcon) 10.dp else 0.dp
                    )
                    .fillMaxWidth(0.9f),
                trailingIcon = {
                    IconButton(
                        onClick = {
                            if (search.isNotEmpty()) {
                                mainViewModel.getBySearch(search)
                                keyboardController.hide()
                                clearFocus(false)
                                showText(true)
                            } else {
                                Toast.makeText(context, context.getText(R.string.enter_product), Toast.LENGTH_SHORT).show()
                            }
                        },
                        modifier = Modifier
                            .padding(end = 12.dp)
                            .size(20.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = EMPTY,
                            tint = Color.Black
                        )
                    }
                },
                mainViewModel = mainViewModel,
                keyboardController = keyboardController,
                showText = { showText(it) },
                item = InputField(isFocused = onClick),
                context = context,
                clearFocus = { clearFocus(it) }
            )
            IconButton(
                onClick = { },
                modifier = Modifier
            ) {
                Icon(
                    imageVector = Icons.Outlined.ShoppingCart,
                    contentDescription = EMPTY,
                    tint = Color.Black
                )
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