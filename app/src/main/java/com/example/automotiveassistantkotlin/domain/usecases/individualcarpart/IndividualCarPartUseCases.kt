package com.example.automotiveassistantkotlin.domain.usecases.individualcarpart

data class IndividualCarPartUseCases(
    val addIndividualCarPart: AddIndividualCarPartUseCase,
    val deleteIndividualCarPart: DeleteIndividualCarPartUseCase,
    val getIndividualCarPartById: GetIndividualCarPartByIdUseCase,
    val getIndividualCarPartsByCarId: GetIndividualCarPartsByCarIdUseCase,
    val getIndividualCarPartsByPartId: GetIndividualCarPartsByPartIdUseCase,
    val updateIndividualCarPart: UpdateIndividualCarPartUseCase
)