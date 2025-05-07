package com.example.automotiveassistantkotlin.domain.entities

import java.util.Date

data class ExpenseModel(
    val id: Long = 0,
    val carId: Long,
    val individualCarPartsId: Long? = null,
    val type: String,
    val mileage: Int,
    val totalPrice: Double,
    val timeOfCreation: Date,
    val comments: String? = null,
    val photoUrl: String? = null
)