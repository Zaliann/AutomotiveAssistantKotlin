package com.example.automotiveassistantkotlin.presentation.models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.automotiveassistantkotlin.domain.entities.ExpenseModel
import com.example.automotiveassistantkotlin.domain.usecases.expenses.GetExpensesByCarIdUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ExpensesViewModel @Inject constructor(
    private val getExpensesByCarIdUseCase: GetExpensesByCarIdUseCase
) : ViewModel() {

    private val _expenses = MutableStateFlow<List<ExpenseModel>>(emptyList())
    val expenses: StateFlow<List<ExpenseModel>> = _expenses.asStateFlow()

    fun loadExpenses(carId: Long) {
        viewModelScope.launch {
            _expenses.value = getExpensesByCarIdUseCase(carId)
        }
    }
}