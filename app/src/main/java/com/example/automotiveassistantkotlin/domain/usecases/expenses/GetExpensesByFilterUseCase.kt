package com.example.automotiveassistantkotlin.domain.usecases.expenses

import com.example.automotiveassistantkotlin.domain.entities.ExpenseModel
import com.example.automotiveassistantkotlin.domain.repositories.ExpenseRepository
import java.util.Date
import javax.inject.Inject

class GetExpensesByFilterUseCase @Inject constructor(
    private val expenseRepository: ExpenseRepository
) {
    suspend operator fun invoke(
        carId: Long,
        fromDate: Date? = null,
        toDate: Date? = null,
        category: String? = null
    ): List<ExpenseModel> {
        return expenseRepository.getExpensesByFilter(carId, fromDate, toDate, category)
    }
}