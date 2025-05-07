package com.example.automotiveassistantkotlin.data.mappers

import com.example.automotiveassistantkotlin.data.entities.ExpenseEntity
import com.example.automotiveassistantkotlin.domain.entities.ExpenseModel

fun ExpenseEntity.toDomain(): ExpenseModel {
    return ExpenseModel(
        id = id,
        carId = carId,
        individualCarPartsId = individualCarPartsId,
        type = type,
        mileage = mileage,
        totalPrice = totalPrice,
        timeOfCreation = timeOfCreation,
        comments = comments,
        photoUrl = photoUrl
    )
}

fun ExpenseModel.toEntity(): ExpenseEntity {
    return ExpenseEntity(
        id = id,
        carId = carId,
        individualCarPartsId = individualCarPartsId,
        type = type,
        mileage = mileage,
        totalPrice = totalPrice,
        timeOfCreation = timeOfCreation,
        comments = comments,
        photoUrl = photoUrl
    )
}