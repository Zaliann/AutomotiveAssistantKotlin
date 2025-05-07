package com.example.automotiveassistantkotlin.domain.usecases.expenses

import com.example.automotiveassistantkotlin.domain.entities.ExpenseModel
import com.example.automotiveassistantkotlin.domain.repositories.ExpenseRepository
import javax.inject.Inject

class GetExpensesByCategoryUseCase @Inject constructor(
    private val expenseRepository: ExpenseRepository
) {
    suspend operator fun invoke(carId: Long, category: String): List<ExpenseModel> {
        return expenseRepository.getExpensesByCategory(carId, category)
    }
}
