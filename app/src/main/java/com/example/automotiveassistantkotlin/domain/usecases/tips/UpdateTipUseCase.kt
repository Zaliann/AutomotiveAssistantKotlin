package com.example.automotiveassistantkotlin.domain.usecases.tips

import com.example.automotiveassistantkotlin.domain.entities.TipModel
import com.example.automotiveassistantkotlin.domain.repositories.TipRepository
import javax.inject.Inject

class UpdateTipUseCase @Inject constructor(
    private val tipRepository: TipRepository
) {
    suspend operator fun invoke(tip: TipModel) {
        tipRepository.updateTip(tip)
    }
}
