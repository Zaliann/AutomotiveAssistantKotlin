package com.example.automotiveassistantkotlin.domain.usecases.expenses

import com.example.automotiveassistantkotlin.domain.entities.ExpenseModel
import com.example.automotiveassistantkotlin.domain.repositories.ExpenseRepository
import java.util.Date
import javax.inject.Inject

data class AnalyticsFilter(
    val carId: Long,
    val fromDate: Date? = null,
    val toDate: Date? = null,
    val category: String? = null
)

class GetExpenseAnalyticsUseCase(
    private val expenseRepository: ExpenseRepository
) {
    suspend operator fun invoke(filter: AnalyticsFilter): List<ExpenseModel> {
        return expenseRepository.getExpensesByFilter(
            carId = filter.carId,
            fromDate = filter.fromDate,
            toDate = filter.toDate,
            category = filter.category
        )
    }
}