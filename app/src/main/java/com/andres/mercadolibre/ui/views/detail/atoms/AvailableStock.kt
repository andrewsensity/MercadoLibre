package com.andres.mercadolibre.ui.views.detail.atoms

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andres.mercadolibre.R
import com.andres.mercadolibre.ui.theme.Blue50
import com.andres.mercadolibre.util.Constants
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AvailableStock(
    context: Context,
    sheetState: ModalBottomSheetState,
    quantit: String,
    cart: (String) -> Unit,
    availableQuantity: Int,
) {
    val scope = rememberCoroutineScope()
    var quantity by rememberSaveable { mutableStateOf("") }
    quantity = quantit
    Text(
        text = stringResource(R.string.available_stock),
        fontSize = 16.sp,
        modifier = Modifier.padding(vertical = 20.dp),
        color = Color.Black
    )
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Gray.copy(alpha = 0.1f)
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 15.dp)
            .height(50.dp),
        shape = RoundedCornerShape(10.dp),
        onClick = { }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { scope.launch { sheetState.show() } },
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = buildAnnotatedString {
                    append(stringResource(R.string.quantity))
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append(if (quantity.isEmpty()) "1" else " ${quantity.toInt() + 1}")
                    }
                    withStyle(style = SpanStyle(color = Color.Gray.copy(alpha = 0.5f))) {
                        append(stringResource(R.string.number_available, availableQuantity))
                    }
                },
                color = Color.Black
            )
            Icon(
                imageVector = Icons.Outlined.KeyboardArrowRight,
                contentDescription = Constants.EMPTY,
                tint = Blue50
            )
        }
    }
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Blue50
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(45.dp),
        shape = RoundedCornerShape(10.dp),
        onClick = {
            Toast.makeText(context, context.getText(R.string.ready_to_shop), Toast.LENGTH_SHORT)
                .show()
        }
    ) {
        Text(text = stringResource(R.string.shop_now), color = Color.White)
    }
    Spacer(modifier = Modifier.height(8.dp))
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Blue50.copy(alpha = 0.2f)
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(45.dp),
        shape = RoundedCornerShape(10.dp),
        onClick = {
            if (quantity.isNotEmpty()) cart((quantity.toInt() + 1).toString())
            else cart(context.getText(R.string.default_value).toString())
        }
    ) {
        Text(text = stringResource(R.string.add_cart), color = Blue50)
    }
}