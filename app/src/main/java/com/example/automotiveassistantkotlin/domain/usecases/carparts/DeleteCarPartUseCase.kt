package com.example.automotiveassistantkotlin.domain.usecases.carparts

import com.example.automotiveassistantkotlin.domain.repositories.CarPartRepository

class DeleteCarPartUseCase (
    private val repository: CarPartRepository
) {
    suspend operator fun invoke(id: Long) {
        repository.deleteCarPart(id)
    }
}