package com.example.automotiveassistantkotlin.domain.repositories

import com.example.automotiveassistantkotlin.domain.entities.CarPartModel

interface CarPartRepository {
    suspend fun addCarPart(carPart: CarPartModel)
    suspend fun deleteCarPart(id: Long)
    suspend fun getCarPartsByCarId(carId: Long): List<CarPartModel>
    suspend fun getCarPartById(id: Long): CarPartModel?
    suspend fun updateCarPart(carPart: CarPartModel)
}