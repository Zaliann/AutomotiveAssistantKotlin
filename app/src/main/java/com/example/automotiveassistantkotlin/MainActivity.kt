package com.example.automotiveassistantkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.automotiveassistantkotlin.presentation.navigation.AppNavHost
import dagger.hilt.android.AndroidEntryPoint
import com.example.automotiveassistantkotlin.ui.theme.AutomotiveAssistantKotlinTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AutomotiveAssistantKotlinTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    AppContent()
                }
            }
        }
    }
}

@Composable
fun AppContent() {
    val navController = rememberNavController()
    AppNavHost(navController = navController) // Здесь ты используешь AppNavHost
}