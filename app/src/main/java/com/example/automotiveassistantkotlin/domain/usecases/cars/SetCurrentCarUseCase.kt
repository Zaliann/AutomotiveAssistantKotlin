package com.example.automotiveassistantkotlin.domain.usecases.cars

import com.example.automotiveassistantkotlin.domain.repositories.CarRepository

class SetCurrentCarUseCase(
    private val carRepository: CarRepository
) {
    suspend operator fun invoke(carId: Long) {
        carRepository.setCurrentCar(carId)
    }
}
