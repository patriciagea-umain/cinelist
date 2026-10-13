package com.umain.cinelist.ui.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.umain.cinelist.ui.splash.SplashScreen
import com.umain.cinelist.ui.home.HomeScreen
import com.umain.cinelist.ui.detail.DetailScreen
import com.umain.cinelist.ui.watchlist.WatchListScreen
import androidx.compose.ui.Modifier



@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppDestination.Splash.route,
                modifier = modifier
    ) {
        composable(AppDestination.Splash.route) {
            SplashScreen(
                onHomeClick = {
                    navController.navigate(AppDestination.Home.route) {
                        popUpTo(AppDestination.Splash.route) { inclusive = true }
                    }
                }
            )
        }

        composable(AppDestination.Home.route) {
            HomeScreen(
                onWatchlistClick = {
                    navController.navigate(AppDestination.WatchList.route)
                },
                onMovieClick = { movieId ->
                    navController.navigate(AppDestination.Detail.createRoute(movieId))
                }
            )
        }

        composable(AppDestination.Detail.route) {
            DetailScreen()
        }

        composable(AppDestination.WatchList.route) {
            WatchListScreen()
        }
    }
}


