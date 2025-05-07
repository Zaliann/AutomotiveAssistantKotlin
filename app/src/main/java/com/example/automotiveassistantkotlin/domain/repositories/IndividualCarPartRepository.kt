package com.example.automotiveassistantkotlin.domain.repositories

import com.example.automotiveassistantkotlin.domain.entities.IndividualCarPartModel

interface IndividualCarPartRepository {

    suspend fun addIndividualCarPart(part: IndividualCarPartModel)

    suspend fun deleteIndividualCarPart(id: Long)

    suspend fun updateIndividualCarPart(part: IndividualCarPartModel)

    suspend fun getIndividualCarPartById(id: Long): IndividualCarPartModel?

    suspend fun getIndividualCarPartsByCarId(carId: Long): List<IndividualCarPartModel>

    suspend fun getIndividualCarPartsByPartId(partId: Long): List<IndividualCarPartModel>

    suspend fun getIndividualCarPartsWithUpcomingReplacement(
        carId: Long,
        currentMileage: Int
    ): List<IndividualCarPartModel>
}