package com.example.automotiveassistantkotlin.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// Car Entity
@Entity(tableName = "cars")
data class CarEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val brand: String,
    val model: String,
    val year: Int,
    @ColumnInfo(name = "initial_mileage") val initialMileage: Int,
    @ColumnInfo(name = "current_mileage") val currentMileage: Int
)