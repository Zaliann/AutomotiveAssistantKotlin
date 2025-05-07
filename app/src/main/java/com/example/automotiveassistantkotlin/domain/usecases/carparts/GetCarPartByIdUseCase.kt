package com.example.automotiveassistantkotlin.domain.usecases.carparts

import com.example.automotiveassistantkotlin.domain.entities.CarPartModel
import com.example.automotiveassistantkotlin.domain.repositories.CarPartRepository

class GetCarPartByIdUseCase (
    private val repository: CarPartRepository
) {
    suspend operator fun invoke(id: Long): CarPartModel? {
        return repository.getCarPartById(id)
    }
}