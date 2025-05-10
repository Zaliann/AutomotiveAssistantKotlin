package com.example.automotiveassistantkotlin.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import androidx.room.Index
import java.util.Date

// IndividualCarPart Entity
@Entity(
    tableName = "individual_car_parts",
    foreignKeys = [
        ForeignKey(entity = CarEntity::class, parentColumns = ["id"], childColumns = ["car_id"], onDelete = ForeignKey.CASCADE),
        ForeignKey(entity = CarPartEntity::class, parentColumns = ["id"], childColumns = ["part_id"], onDelete = ForeignKey.CASCADE)
    ],
    indices = [
        Index(value = ["car_id"]),
        Index(value = ["part_id"])
    ]
)
data class IndividualCarPartEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "car_id") val carId: Long,
    @ColumnInfo(name = "part_id") val partId: Long,
    @ColumnInfo(name = "custom_resource") val customResource: Int? = null, // Optional
    @ColumnInfo(name = "last_replacement_km") val lastReplacementKm: Int? = null, // Optional
    @ColumnInfo(name = "is_custom") val isCustom: Boolean = false,
    @ColumnInfo(name = "replacement_date") val replacementDate: Date? = null, // Добавлено опциональное поле
    @ColumnInfo(name = "replacement_price") val replacementPrice: Double? = null // Добавлено опциональное поле
)