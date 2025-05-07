package com.example.automotiveassistantkotlin.domain.usecases.tips

import com.example.automotiveassistantkotlin.domain.repositories.TipRepository
import javax.inject.Inject

class DeleteTipUseCase @Inject constructor(
    private val tipRepository: TipRepository
) {
    suspend operator fun invoke(id: Long) {
        tipRepository.deleteTip(id)
    }
}