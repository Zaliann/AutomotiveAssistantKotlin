package com.example.automotiveassistantkotlin.domain.usecases.individualcarpart

import com.example.automotiveassistantkotlin.domain.entities.IndividualCarPartModel
import com.example.automotiveassistantkotlin.domain.repositories.IndividualCarPartRepository
import javax.inject.Inject

class GetIndividualCarPartByIdUseCase @Inject constructor(
    private val repository: IndividualCarPartRepository
) {
    suspend operator fun invoke(id: Long): IndividualCarPartModel? {
        return repository.getIndividualCarPartById(id)
    }
}
