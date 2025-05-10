package com.example.automotiveassistantkotlin.data.entities

import androidx.room.*
import java.util.*

// Expense Entity
@Entity(
    tableName = "expenses",
    foreignKeys = [
        ForeignKey(entity = CarEntity::class, parentColumns = ["id"], childColumns = ["car_id"], onDelete = ForeignKey.CASCADE),
        ForeignKey(entity = IndividualCarPartEntity::class, parentColumns = ["id"], childColumns = ["individual_car_parts_id"], onDelete = ForeignKey.SET_NULL)
    ],
    indices = [Index(value = ["car_id"]),
        Index(value = ["individual_car_parts_id"])]
)
data class ExpenseEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "car_id") val carId: Long,
    @ColumnInfo(name = "individual_car_parts_id") val individualCarPartsId: Long? = null, // Optional
    val type: String, // ("Заправка", "Мойка", "ТО", "Парковка", "Штрафы", "Налоги", "Страхование")
    val mileage: Int,
    @ColumnInfo(name = "total_price") val totalPrice: Double,
    @ColumnInfo(name = "time_of_creation") val timeOfCreation: Date,
    val comments: String? = null,
    @ColumnInfo(name = "photo_url") val photoUrl: String? = null // Добавлено опциональное поле
)