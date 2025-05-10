package com.example.automotiveassistantkotlin.data.repositories

import com.example.automotiveassistantkotlin.data.database.dao.ExpenseDao
import com.example.automotiveassistantkotlin.data.mappers.toDomain
import com.example.automotiveassistantkotlin.data.mappers.toEntity
import com.example.automotiveassistantkotlin.domain.entities.ExpenseModel
import com.example.automotiveassistantkotlin.domain.repositories.ExpenseRepository
import java.util.Date
import javax.inject.Inject

class ExpenseRepositoryImpl @Inject constructor(
    private val expenseDao: ExpenseDao
) : ExpenseRepository {

    override suspend fun addExpense(expense: ExpenseModel) {
        expenseDao.insertExpense(expense.toEntity())
    }

    override suspend fun getExpensesByFilter(
        carId: Long,
        fromDate: Date?,
        toDate: Date?,
        category: String?
    ): List<ExpenseModel> {
        return expenseDao.getExpensesByFilter(carId, fromDate, toDate, category).map { it.toDomain() }
    }

    override suspend fun updateExpense(expense: ExpenseModel) {
        expenseDao.updateExpense(expense.toEntity())
    }

    override suspend fun deleteExpense(expenseId: Long) {
        expenseDao.deleteExpenseById(expenseId)
    }
}