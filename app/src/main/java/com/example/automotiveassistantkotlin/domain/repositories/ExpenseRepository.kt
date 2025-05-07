package com.example.automotiveassistantkotlin.domain.repositories

import com.example.automotiveassistantkotlin.domain.entities.ExpenseModel
import java.util.Date

interface ExpenseRepository {
    suspend fun addExpense(expense: ExpenseModel)
    suspend fun getExpensesByCarId(carId: Long, startDate: Date? = null, endDate: Date? = null): List<ExpenseModel>
    suspend fun getExpensesByCategory(carId: Long, category: String): List<ExpenseModel>
    suspend fun getExpensesByFilter(carId: Long, fromDate: Date?, toDate: Date?, category: String?): List<ExpenseModel>
    suspend fun getExpenseById(expenseId: Long): ExpenseModel?
    suspend fun updateExpense(expense: ExpenseModel)
    suspend fun deleteExpense(expenseId: Long)
}
