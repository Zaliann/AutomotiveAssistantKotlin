package com.example.automotiveassistantkotlin.domain.usecases.individualcarpart

import com.example.automotiveassistantkotlin.domain.entities.IndividualCarPartModel
import com.example.automotiveassistantkotlin.domain.repositories.IndividualCarPartRepository
import javax.inject.Inject

class GetIndividualCarPartsWithUpcomingReplacementUseCase @Inject constructor(
    private val repository: IndividualCarPartRepository
) {
    suspend operator fun invoke(carId: Long, currentMileage: Int): List<IndividualCarPartModel> {
        return repository.getIndividualCarPartsWithUpcomingReplacement(carId, currentMileage)
    }
}
