package com.example.automotiveassistantkotlin.data.mappers

import com.example.automotiveassistantkotlin.data.entities.CarPartEntity
import com.example.automotiveassistantkotlin.domain.entities.CarPartModel

fun CarPartEntity.toDomain(): CarPartModel = CarPartModel(
    id = id,
    name = name,
    defaultResource = defaultResource,
    lastPrice = lastPrice,
    manufacturer = manufacturer
)

fun CarPartModel.toData(): CarPartEntity = CarPartEntity(
    id = id,
    name = name,
    defaultResource = defaultResource,
    lastPrice = lastPrice,
    manufacturer = manufacturer
)