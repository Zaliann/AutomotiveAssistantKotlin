package com.example.automotiveassistantkotlin.domain.repositories

import com.example.automotiveassistantkotlin.domain.entities.TipModel

interface TipRepository {
    suspend fun addTip(tip: TipModel)
    suspend fun deleteTip(id: Long)
    suspend fun getTipById(id: Long): TipModel?
    suspend fun updateTip(tip: TipModel)
}