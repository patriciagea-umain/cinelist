package com.umain.cinelist.ui.splash

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SplashScreen(
    onHomeClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(text ="Splash")
        Button(onClick = {onHomeClick() }) {
            Text(text ="Home")
        }
    }
}