package com.example.automotiveassistantkotlin.domain.usecases.tips

import com.example.automotiveassistantkotlin.domain.entities.TipModel
import com.example.automotiveassistantkotlin.domain.repositories.TipRepository
import javax.inject.Inject

class GetTipByIdUseCase @Inject constructor(
    private val tipRepository: TipRepository
) {
    suspend operator fun invoke(id: Long): TipModel? {
        return tipRepository.getTipById(id)
    }
}