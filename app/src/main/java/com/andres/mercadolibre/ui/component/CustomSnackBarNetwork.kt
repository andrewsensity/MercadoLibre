package com.andres.mercadolibre.ui.component

import android.app.Activity
import android.content.Context
import android.view.WindowManager
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andres.mercadolibre.R
import com.andres.mercadolibre.ui.theme.Blue
import com.andres.mercadolibre.ui.theme.Gray

@Composable
fun CustomSnackBarNetwork(
    showSnackBar: Boolean,
    context: Context,
    contentDescription: String,
    title: String,
    description: String,
) {
    val background = Color.Transparent
    val activity = context as Activity
    val window = activity.window
    if (showSnackBar) {
        val focusManager = LocalFocusManager.current
        focusManager.clearFocus()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
        )
    } else {
        window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
    }
    Box(
        modifier = Modifier
            .background(background)
            .fillMaxSize()
    ) {
        AnimatedVisibility(
            visible = showSnackBar,
            enter = slideInVertically(),
            exit = slideOutVertically() + fadeOut(animationSpec = tween(durationMillis = 5000))
        ) {
            Box(
                modifier = Modifier.fillMaxSize().padding(top = 8.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 12.dp, end = 10.dp, bottom = 12.dp),
                    backgroundColor = Color.White,
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_wifi_exclamation),
                            contentDescription = contentDescription,
                            tint = Blue,
                        )
                        Column(
                            modifier = Modifier
                                .padding(start = 8.dp)
                        ) {
                            Text(
                                text = title,
                                modifier = Modifier.fillMaxWidth(),
                                style = MaterialTheme.typography.caption,
                                textAlign = TextAlign.Left,
                                fontWeight = FontWeight.Bold,
                                color = Blue,
                            )
                            Text(
                                text = description,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 3.dp),
                                style = MaterialTheme.typography.overline,
                                fontSize = 11.sp,
                                textAlign = TextAlign.Left,
                                color = Blue,
                            )
                        }
                    }
                }
            }
        }
    }
}