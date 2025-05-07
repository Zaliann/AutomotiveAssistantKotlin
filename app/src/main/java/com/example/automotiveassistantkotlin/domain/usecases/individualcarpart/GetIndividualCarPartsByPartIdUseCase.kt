package com.example.automotiveassistantkotlin.domain.usecases.individualcarpart

import com.example.automotiveassistantkotlin.domain.entities.IndividualCarPartModel
import com.example.automotiveassistantkotlin.domain.repositories.IndividualCarPartRepository
import javax.inject.Inject

class GetIndividualCarPartsByPartIdUseCase @Inject constructor(
    private val repository: IndividualCarPartRepository
) {
    suspend operator fun invoke(partId: Long): List<IndividualCarPartModel> {
        return repository.getIndividualCarPartsByPartId(partId)
    }
}
