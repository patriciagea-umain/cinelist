package com.umain.cinelist.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.Button
import androidx.compose.ui.Modifier


@Composable
fun HomeScreen(
    onWatchlistClick: () -> Unit,
    onMovieClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(text = "Home")
        Button(onClick = { onWatchlistClick() }) {
            Text(text = "My Watchlist")
        }
        Button(onClick = { onMovieClick(1) }) {
            Text(text = "Open movie detail")
        }
    }
}