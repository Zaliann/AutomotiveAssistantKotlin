package com.example.automotiveassistantkotlin.domain.usecases.individualcarpart

import com.example.automotiveassistantkotlin.domain.entities.IndividualCarPartModel
import com.example.automotiveassistantkotlin.domain.repositories.IndividualCarPartRepository
import javax.inject.Inject

class AddIndividualCarPartUseCase @Inject constructor(
    private val repository: IndividualCarPartRepository
) {
    suspend operator fun invoke(individualCarPart: IndividualCarPartModel) {
        repository.addIndividualCarPart(individualCarPart)
    }
}
