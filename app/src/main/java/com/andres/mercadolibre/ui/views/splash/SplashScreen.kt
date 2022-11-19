package com.andres.mercadolibre.ui.views.splash

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.andres.mercadolibre.R
import com.andres.mercadolibre.ui.navigation.Screen
import com.andres.mercadolibre.ui.theme.Blue
import com.andres.mercadolibre.ui.theme.Yellow
import com.andres.mercadolibre.util.Constants.EMPTY
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController,
) {
    val scale = remember { androidx.compose.animation.core.Animatable(0f) }
    val time by remember { mutableStateOf(1000) }
    val destination = Screen.MainScreen.route
    LaunchedEffect(key1 = true) {
        scale.animateTo(targetValue = 1f,
            animationSpec = tween(
                durationMillis = time,
            ))
        delay(time.toLong())
        navController.navigate(destination) {
            popUpTo(Screen.SplashScreen.route) { inclusive = true }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Yellow),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier)
        AnimatedVisibility(visible = true) {
            Image(
                painter = painterResource(id = R.drawable.mercado_libre),
                contentDescription = EMPTY,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 60.dp, top = 40.dp, end = 60.dp)
                    .size(100.dp)
                    .scale(scale.value)
            )
        }
        Column(Modifier.padding(20.dp)) {
            Text(
                text = stringResource(R.string.by_andres),
                color = Blue,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}