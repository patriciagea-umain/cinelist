package com.umain.cinelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.umain.cinelist.ui.navigation.AppNavigation

import com.umain.cinelist.ui.theme.CinelistTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CinelistTheme {
            AppNavigation()
            CinelistTheme {


                }
            }
        }
    }}
