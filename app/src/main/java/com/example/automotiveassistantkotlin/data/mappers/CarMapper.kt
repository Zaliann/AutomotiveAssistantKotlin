package com.example.automotiveassistantkotlin.data.mappers

import com.example.automotiveassistantkotlin.data.entities.CarEntity
import com.example.automotiveassistantkotlin.domain.entities.CarModel

fun CarEntity.toDomain(): CarModel = CarModel(
    id = id,
    brand = brand,
    model = model,
    year = year,
    initialMileage = initialMileage,
    currentMileage = currentMileage
)

fun CarModel.toData(): CarEntity = CarEntity(
    id = id,
    brand = brand,
    model = model,
    year = year,
    initialMileage = initialMileage,
    currentMileage = currentMileage
)