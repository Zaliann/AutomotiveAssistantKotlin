package com.example.automotiveassistantkotlin.domain.usecases.cars

import com.example.automotiveassistantkotlin.domain.repositories.CarRepository

class UpdateCarMileageUseCase(
    private val carRepository: CarRepository
) {
    suspend operator fun invoke(carId: Long, newMileage: Int) {
        carRepository.updateMileage(carId, newMileage)
    }
}