package com.andres.mercadolibre.ui.views.main.atoms

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.SoftwareKeyboardController
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andres.mercadolibre.R
import com.andres.mercadolibre.ui.views.main.MainViewModel
import com.andres.mercadolibre.util.Constants

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun itemCategories(
    index: Int,
    category: String,
    onClick: (Boolean) -> Unit,
    product: (String) -> Unit,
    mainViewModel: MainViewModel,
    keyboardController: SoftwareKeyboardController,
    clearFocus: (Boolean) -> Unit,
    showText: (Boolean) -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .padding(vertical = 8.dp, horizontal = 20.dp)
            .fillMaxWidth()
            .clickable {
                onClick(true)
                product(category)
                mainViewModel.getBySearch(category)
                keyboardController.hide()
                clearFocus(false)
                showText(true)
            }
    ) {
        Card(
            modifier = Modifier
                .padding(end = 12.dp)
                .size(50.dp),
            shape = CircleShape
        ) {
            Icon(
                imageVector = Constants.listCategories[index],
                contentDescription = Constants.EMPTY,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp)
            )
        }
        Text(
            text = category,
            fontSize = 14.sp,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier,
            color = Color.Black
        )
    }
    Divider(modifier = Modifier.padding(horizontal = 20.dp))
}