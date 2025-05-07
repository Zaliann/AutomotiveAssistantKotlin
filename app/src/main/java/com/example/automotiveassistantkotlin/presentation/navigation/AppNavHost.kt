package com.example.automotiveassistantkotlin.presentation.navigation

import androidx.compose.runtime.Composable
import com.example.automotiveassistantkotlin.presentation.views.ExpensesScreen
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController, startDestination = "expenses_screen") {
        composable("expenses_screen") {
            ExpensesScreen(carId = 1L) // временно фиксированный ID
        }
    }
}