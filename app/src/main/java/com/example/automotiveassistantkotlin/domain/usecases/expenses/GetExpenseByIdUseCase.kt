package com.example.automotiveassistantkotlin.domain.usecases.expenses

import com.example.automotiveassistantkotlin.domain.entities.ExpenseModel
import com.example.automotiveassistantkotlin.domain.repositories.ExpenseRepository
import javax.inject.Inject

class GetExpenseByIdUseCase @Inject constructor(
    private val expenseRepository: ExpenseRepository
) {
    suspend operator fun invoke(expenseId: Long): ExpenseModel? {
        return expenseRepository.getExpenseById(expenseId)
    }
}
