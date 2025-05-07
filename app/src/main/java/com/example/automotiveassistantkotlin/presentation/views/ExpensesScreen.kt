package com.example.automotiveassistantkotlin.presentation.views

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.automotiveassistantkotlin.domain.entities.ExpenseModel
import com.example.automotiveassistantkotlin.presentation.models.ExpensesViewModel
import java.text.SimpleDateFormat
import java.util.Locale


@Composable
fun ExpensesScreen(
    viewModel: ExpensesViewModel = hiltViewModel(),
    carId: Long
) {
    val expenses by viewModel.expenses.collectAsState()

    LaunchedEffect(carId) {
        viewModel.loadExpenses(carId)
    }

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(expenses) { expense ->
            ExpenseItem(expense)
        }
    }
}

@Composable
fun ExpenseItem(expense: ExpenseModel) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Тип: ${expense.type}")
            Text(text = "Сумма: ${expense.totalPrice}₽")
            Text(text = "Пробег: ${expense.mileage} км")
            Text(text = "Дата: ${SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(expense.timeOfCreation)}")
            if (!expense.comments.isNullOrBlank()) {
                Text(text = "Комментарий: ${expense.comments}")
            }
        }
    }
}