package com.example.automotiveassistantkotlin.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey



// CarPart Entity
@Entity(tableName = "car_parts")
data class CarPartEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val defaultResource: Int, // Ресурс в км
    @ColumnInfo(name = "last_price") val lastPrice: Double? = null, // Optional
    @ColumnInfo(name = "manufacturer") val manufacturer: String? = null // Optional
)
