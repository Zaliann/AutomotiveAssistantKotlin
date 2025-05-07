package com.example.automotiveassistantkotlin.data.mappers

import com.example.automotiveassistantkotlin.data.entities.TipEntity
import com.example.automotiveassistantkotlin.domain.entities.TipModel

fun TipEntity.toDomain(): TipModel = TipModel(
    id = id,
    title = title,
    text = text
)

fun TipModel.toData(): TipEntity = TipEntity(
    id = id,
    title = title,
    text = text
)