package com.example.automotiveassistantkotlin.domain.usecases.cars

import com.example.automotiveassistantkotlin.domain.entities.CarModel
import com.example.automotiveassistantkotlin.domain.repositories.CarRepository

class GetAllCarsUseCase(
    private val carRepository: CarRepository
) {
    suspend operator fun invoke(): List<CarModel> {
        return carRepository.getAllCars()
    }
}
