package com.example.automotiveassistantkotlin.domain.repositories

import com.example.automotiveassistantkotlin.domain.entities.CarModel

interface CarRepository {
    suspend fun getCurrentCar(): CarModel?
    suspend fun updateMileage(carId: Long, mileage: Int)
    suspend fun setCurrentCar(carId: Long)
    suspend fun getAllCars(): List<CarModel>
    suspend fun insertCar(car: CarModel)
    suspend fun deleteCar(carId: Long)
}
