package com.umain.cinelist.ui.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.umain.cinelist.ui.splash.SlashScreen
import com.umain.cinelist.ui.home.HomeScreen
import com.umain.cinelist.ui.detail.DetailScreen
import com.umain.cinelist.ui.watchlist.WatchListScreen




@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppDestination.Splash.route
    )

    {
        composable(AppDestination.Splash.route) {
            SlashScreen()
        }
        composable(AppDestination.Home.route) {
            HomeScreen()
        }

        composable(AppDestination.Detail.route) {
            DetailScreen()
        }

        composable(AppDestination.WatchList.route) {
            WatchListScreen()
        }
    }}


