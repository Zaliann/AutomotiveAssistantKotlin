package com.example.automotiveassistantkotlin.domain.usecases.carparts

import com.example.automotiveassistantkotlin.domain.entities.CarPartModel
import com.example.automotiveassistantkotlin.domain.repositories.CarPartRepository

class AddCarPartUseCase ( private val repository: CarPartRepository
) {
    suspend operator fun invoke(carPart: CarPartModel) {
        repository.addCarPart(carPart)
    }
}