package com.andres.mercadolibre.ui.views.main.atoms

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.SoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.andres.mercadolibre.R
import com.andres.mercadolibre.ui.theme.Blue
import com.andres.mercadolibre.ui.views.main.InputField
import com.andres.mercadolibre.ui.views.main.MainViewModel

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    trailingIcon: @Composable () -> Unit,
    placeholderText: String = stringResource(R.string.search_on_meli),
    fontSize: TextUnit = MaterialTheme.typography.bodyMedium.fontSize,
    mainViewModel: MainViewModel,
    keyboardController: SoftwareKeyboardController,
    showText: (Boolean) -> Unit,
    onChangeSearch: (String) -> Unit,
    search: String,
    item: InputField,
    context: Context,
    clearFocus: (Boolean) -> Unit,
) {
    val requester = FocusRequester()
    SideEffect { if (item.isFocused) { requester.requestFocus() } }
    BasicTextField(
        modifier = modifier
            .background(
                Color.White,
                RoundedCornerShape(20.dp)
            )
            .focusRequester(requester),
        value = search,
        onValueChange = onChangeSearch,
        singleLine = true,
        cursorBrush = SolidColor(Blue),
        textStyle = LocalTextStyle.current.copy(
            color = MaterialTheme.colorScheme.onSurface,
            fontSize = fontSize
        ),
        decorationBox = { innerTextField ->
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(modifier = Modifier.padding(vertical = 8.dp, horizontal = 12.dp)) {
                    if (search.isEmpty()) Text(
                        text = placeholderText,
                        style = LocalTextStyle.current.copy(
                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.3f),
                            fontSize = fontSize
                        )
                    )
                    innerTextField()
                }
                trailingIcon()
            }
        },
        keyboardActions = KeyboardActions(
            onSearch = {
                if (search.isNotEmpty()) {
                    mainViewModel.getBySearch(search)
                    keyboardController.hide()
                    showText(true)
                    clearFocus(false)
                } else {
                    Toast.makeText(context,
                        context.getText(R.string.enter_product),
                        Toast.LENGTH_SHORT).show()
                }
            }
        ),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Search
        )
    )
}