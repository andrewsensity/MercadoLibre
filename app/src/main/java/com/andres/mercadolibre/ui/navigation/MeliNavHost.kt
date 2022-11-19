package com.andres.mercadolibre.ui.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun MeliNavHost(
    navController: NavHostController = rememberAnimatedNavController(),
    startDestination: String = Screen.MainScreen.route,
) {
    AnimatedNavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        splashGraph(navController)
        mainGraph(navController)
    }
}