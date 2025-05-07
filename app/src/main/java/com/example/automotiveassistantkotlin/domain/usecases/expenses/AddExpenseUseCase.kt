package com.example.automotiveassistantkotlin.domain.usecases.expenses

import com.example.automotiveassistantkotlin.domain.entities.ExpenseModel
import com.example.automotiveassistantkotlin.domain.repositories.ExpenseRepository
import java.util.Date
import javax.inject.Inject

class AddExpenseUseCase @Inject constructor(
    private val expenseRepository: ExpenseRepository
) {
    suspend operator fun invoke(
        carId: Long,
        type: String,
        mileage: Int,
        totalPrice: Double,
        comments: String? = null,
        photoUrl: String? = null,
        individualCarPartsId: Long? = null
    ) {
        val expense = ExpenseModel(
            carId = carId,
            type = type,
            mileage = mileage,
            totalPrice = totalPrice,
            timeOfCreation = Date(),
            comments = comments,
            photoUrl = photoUrl,
            individualCarPartsId = individualCarPartsId
        )
        expenseRepository.addExpense(expense)
    }
}
