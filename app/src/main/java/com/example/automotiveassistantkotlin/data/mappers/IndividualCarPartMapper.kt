package com.example.automotiveassistantkotlin.data.mappers

import com.example.automotiveassistantkotlin.data.entities.IndividualCarPartEntity
import com.example.automotiveassistantkotlin.domain.entities.IndividualCarPartModel

fun IndividualCarPartEntity.toDomain(): IndividualCarPartModel = IndividualCarPartModel(
    id = id,
    carId = carId,
    partId = partId,
    customResource = customResource,
    lastReplacementKm = lastReplacementKm,
    isCustom = isCustom,
    replacementDate = replacementDate,
    replacementPrice = replacementPrice
)

fun IndividualCarPartModel.toData(): IndividualCarPartEntity = IndividualCarPartEntity(
    id = id,
    carId = carId,
    partId = partId,
    customResource = customResource,
    lastReplacementKm = lastReplacementKm,
    isCustom = isCustom,
    replacementDate = replacementDate,
    replacementPrice = replacementPrice
)