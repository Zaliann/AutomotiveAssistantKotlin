package com.example.automotiveassistantkotlin.domain.usecases.cars

import com.example.automotiveassistantkotlin.domain.entities.CarModel
import com.example.automotiveassistantkotlin.domain.repositories.CarRepository

class AddCarUseCase(
    private val carRepository: CarRepository
) {
    suspend operator fun invoke(car: CarModel) {
        carRepository.insertCar(car)
    }
}
