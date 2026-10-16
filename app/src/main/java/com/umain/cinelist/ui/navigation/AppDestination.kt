package com.umain.cinelist.ui.navigation

sealed class AppDestination(val route: String) {
    data object Splash : AppDestination("splash")
    data object Home : AppDestination("home")
    data object Detail : AppDestination("detail/{detailId}") {
        fun createRoute(detailId: Int) = "detail/$detailId"
    }
    data object WatchList : AppDestination("watchlist")

    }

