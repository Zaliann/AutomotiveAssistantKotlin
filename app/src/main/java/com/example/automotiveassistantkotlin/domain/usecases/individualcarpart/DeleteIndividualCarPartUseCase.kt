package com.example.automotiveassistantkotlin.domain.usecases.individualcarpart

import com.example.automotiveassistantkotlin.domain.repositories.IndividualCarPartRepository
import javax.inject.Inject

class DeleteIndividualCarPartUseCase @Inject constructor(
    private val repository: IndividualCarPartRepository
) {
    suspend operator fun invoke(id: Long) {
        repository.deleteIndividualCarPart(id)
    }
}
