package com.andres.mercadolibre.ui.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.andres.mercadolibre.domain.model.search.Result
import com.andres.mercadolibre.ui.views.detail.DetailScreen
import com.andres.mercadolibre.ui.views.main.MainScreen
import com.andres.mercadolibre.ui.views.splash.SplashScreen
import com.andres.mercadolibre.util.Constants.ID_PARAMETER
import com.andres.mercadolibre.util.Constants.RESULT
import com.andres.mercadolibre.util.Util.fromJson
import com.google.accompanist.navigation.animation.composable

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.splashGraph(navController: NavController) {
    composable(Screen.SplashScreen.route) { SplashScreen(navController) }
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.mainGraph(navController: NavController) {
    composable(route = Screen.MainScreen.route) {
        MainScreen(navController = navController)
    }

    composable(
        route = "${Screen.DetailScreen.route}?$ID_PARAMETER={$ID_PARAMETER}&$RESULT={$RESULT}",
        arguments = listOf(
            navArgument(ID_PARAMETER) { type = NavType.StringType },
            navArgument(RESULT) { defaultValue = "" }
        ),
        enterTransition = {
            slideInVertically(initialOffsetY = { 4000 })
        },
        exitTransition = {
            slideOutVertically(targetOffsetY = { 2000 })
        }
    ) { navBackStackEntry ->
        navBackStackEntry.arguments?.let { bundle ->
            val id = bundle.getString(ID_PARAMETER) ?: ""
            val result = bundle.getString(RESULT)
            DetailScreen(
                id = id,
                result = result?.fromJson(Result::class.java) ?: Result(),
                navController = navController
            )
        }
    }
}