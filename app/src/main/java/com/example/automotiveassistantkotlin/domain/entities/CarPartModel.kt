package com.example.automotiveassistantkotlin.domain.entities

data class CarPartModel(
    val id: Long = 0,
    val name: String,
    val defaultResource: Int,
    val lastPrice: Double? = null,
    val manufacturer: String? = null
)