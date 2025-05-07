package com.example.automotiveassistantkotlin.data.repositories

class ExpenseRepositoryImpl(
    private val expenseDao: ExpenseDao
) : ExpenseRepository {

    override suspend fun getExpensesByFilter(
        carId: Long,
        fromDate: Date?,
        toDate: Date?,
        category: String?
    ): List<Expense> {
        return expenseDao.getExpensesByCarId(carId)
            .filter { expense ->
                (fromDate == null || expense.timeOfCreation >= fromDate) &&
                        (toDate == null || expense.timeOfCreation <= toDate) &&
                        (category == null || expense.type == category)
            }
            .map { it.toDomain() }
    }

    // Другие методы, например addExpense(), deleteExpense() и т.п.
}