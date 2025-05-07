package com.example.automotiveassistantkotlin.domain.entities

import java.util.Date

data class IndividualCarPartModel(
    val id: Long = 0,
    val carId: Long,
    val partId: Long,
    val customResource: Int? = null,
    val lastReplacementKm: Int? = null,
    val isCustom: Boolean = false,
    val replacementDate: Date? = null,
    val replacementPrice: Double? = null
)