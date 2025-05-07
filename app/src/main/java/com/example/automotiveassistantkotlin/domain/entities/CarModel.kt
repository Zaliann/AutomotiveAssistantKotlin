package com.example.automotiveassistantkotlin.domain.entities

data class CarModel(
    val id: Long = 0,
    val brand: String,
    val model: String,
    val year: Int,
    val initialMileage: Int,
    val currentMileage: Int
)