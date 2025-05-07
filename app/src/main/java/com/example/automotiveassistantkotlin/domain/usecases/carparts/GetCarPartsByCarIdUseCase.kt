package com.example.automotiveassistantkotlin.domain.usecases.carparts

import com.example.automotiveassistantkotlin.domain.entities.CarPartModel
import com.example.automotiveassistantkotlin.domain.repositories.CarPartRepository

class GetCarPartsByCarIdUseCase (
    private val repository: CarPartRepository
) {
    suspend operator fun invoke(carId: Long): List<CarPartModel> {
        return repository.getCarPartsByCarId(carId)
    }
}