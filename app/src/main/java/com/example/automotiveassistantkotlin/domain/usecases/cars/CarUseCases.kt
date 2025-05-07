package com.example.automotiveassistantkotlin.domain.usecases.cars

data class CarUseCases(
    val getCurrentCar: GetCurrentCarUseCase,
    val updateCarMileage: UpdateCarMileageUseCase,
    val setCurrentCar: SetCurrentCarUseCase,
    val addCar: AddCarUseCase,
    val getAllCars: GetAllCarsUseCase,
    val deleteCar: DeleteCarUseCase
)
