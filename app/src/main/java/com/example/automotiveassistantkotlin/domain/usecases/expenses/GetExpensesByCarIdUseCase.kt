package com.example.automotiveassistantkotlin.domain.usecases.expenses

import com.example.automotiveassistantkotlin.domain.entities.ExpenseModel
import com.example.automotiveassistantkotlin.domain.repositories.ExpenseRepository
import java.util.Date
import javax.inject.Inject

class GetExpensesByCarIdUseCase @Inject constructor(
    private val expenseRepository: ExpenseRepository
) {
    suspend operator fun invoke(
        carId: Long,
        startDate: Date? = null,
        endDate: Date? = null
    ): List<ExpenseModel> {
        return expenseRepository.getExpensesByCarId(carId, startDate, endDate)
    }
}
