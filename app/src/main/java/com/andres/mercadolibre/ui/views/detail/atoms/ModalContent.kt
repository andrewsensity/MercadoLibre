package com.andres.mercadolibre.ui.views.detail.atoms

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.ModalBottomSheetState
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andres.mercadolibre.R
import com.andres.mercadolibre.ui.theme.Blue
import com.andres.mercadolibre.ui.theme.Blue50
import com.andres.mercadolibre.ui.views.detail.BottomSheetContent
import com.andres.mercadolibre.util.Constants.EMPTY
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ModalContent(
    quantity: (String) -> Unit,
    sheetState: ModalBottomSheetState,
    scope: CoroutineScope,
    modalBottomSheetState: BottomSheetContent,
    typeModal: (BottomSheetContent) -> Unit,
    initialQuantity: Int,
) {
    when (modalBottomSheetState) {
        BottomSheetContent.EnterQuantity -> EnterQuantity(
            quantity = quantity,
            sheetState = sheetState,
            scope = scope,
            typeModal = { type -> typeModal(type) },
            initialQuantity = initialQuantity
        )
        BottomSheetContent.SelectQuantity -> SelectQuantity(
            quantity = quantity,
            sheetState = sheetState,
            scope = scope,
            typeModal = { type -> typeModal(type) }
        )
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun EnterQuantity(
    quantity: (String) -> Unit,
    sheetState: ModalBottomSheetState,
    scope: CoroutineScope,
    typeModal: (BottomSheetContent) -> Unit,
    initialQuantity: Int,
) {
    var value by remember { mutableStateOf(EMPTY) }
    var isEnabled by remember { mutableStateOf(false) }
    var errorEnabled by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(540.dp)
            .padding(vertical = 20.dp)
    ) {
        Text(
            text = stringResource(R.string.choose_quantity),
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 20.dp, end = 20.dp, bottom = 4.dp)
        )
        Text(
            text = stringResource(R.string.available, initialQuantity),
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(horizontal = 20.dp)
        )
        val requester = FocusRequester()
        SideEffect { requester.requestFocus() }
        BasicTextField(
            modifier = Modifier
                .background(Color.White)
                .focusRequester(requester)
                .fillMaxWidth(),
            value = value,
            onValueChange = {
                value = it
                if (it.isNotEmpty()) errorEnabled = it.toInt() > initialQuantity
            },
            singleLine = true,
            cursorBrush = SolidColor(Blue),
            textStyle = LocalTextStyle.current.copy(
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = MaterialTheme.typography.bodyMedium.fontSize
            ),
            decorationBox = { innerTextField ->
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Box(modifier = Modifier.padding(vertical = 8.dp, horizontal = 20.dp)) {
                        if (value.isEmpty()) Text(
                            text = stringResource(R.string.enter_quantity),
                            style = LocalTextStyle.current.copy(
                                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.3f),
                                fontSize = MaterialTheme.typography.bodyMedium.fontSize
                            )
                        )
                        innerTextField()
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                            .height(2.dp)
                            .background(if (errorEnabled) Color.Red else Blue50)
                    )
                }
            },
            keyboardActions = KeyboardActions(
                onSend = {
                    quantity((value.toInt() - 1).toString())
                    typeModal(BottomSheetContent.SelectQuantity)
                    scope.launch { sheetState.hide() }
                }
            ),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Send,
                keyboardType = KeyboardType.Number
            ),
        )
        AnimatedVisibility(visible = errorEnabled) {
            Text(
                text = stringResource(R.string.without_stock),
                fontSize = 10.sp,
                color = Color.Red,
                modifier = Modifier.padding(start = 24.dp)
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        isEnabled = value.isNotEmpty() && !errorEnabled
        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Blue50
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp)
                .padding(horizontal = 20.dp),
            shape = RoundedCornerShape(10.dp),
            onClick = {
                quantity((value.toInt() - 1).toString())
                typeModal(BottomSheetContent.SelectQuantity)
                scope.launch { sheetState.hide() }
            },
            enabled = isEnabled
        ) {
            Text(text = stringResource(R.string.apply), color = Color.White)
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SelectQuantity(
    quantity: (String) -> Unit,
    sheetState: ModalBottomSheetState,
    scope: CoroutineScope,
    typeModal: (BottomSheetContent) -> Unit,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp)
    ) {
        Text(
            text = stringResource(R.string.choose_quantity),
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 20.dp, bottom = 20.dp)
        )
        repeat(7) { number ->
            val unity =
                if (number == 0) stringResource(R.string.unity) else stringResource(R.string.unities)
            Divider()
            if (number == 6) {
                Text(
                    text = stringResource(id = R.string.more_than_unities, number),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .clickable {
                            quantity(number.toString())
                            typeModal(BottomSheetContent.EnterQuantity)
                        },
                    textAlign = TextAlign.Center
                )
            } else {
                Text(
                    text = "${number + 1} $unity",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .clickable {
                            quantity(number.toString())
                            scope.launch { sheetState.hide() }
                        },
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
