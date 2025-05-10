package com.example.automotiveassistantkotlin.data.database.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.automotiveassistantkotlin.data.database.dao.ExpenseDao
import com.example.automotiveassistantkotlin.data.database.converters.Converters
import com.example.automotiveassistantkotlin.data.entities.CarEntity
import com.example.automotiveassistantkotlin.data.entities.CarPartEntity
import com.example.automotiveassistantkotlin.data.entities.ExpenseEntity
import com.example.automotiveassistantkotlin.data.entities.IndividualCarPartEntity
import com.example.automotiveassistantkotlin.data.entities.TipEntity

@Database(entities = [ExpenseEntity::class,
                     CarEntity::class,
                     IndividualCarPartEntity::class,
                     CarPartEntity::class,
                     TipEntity::class], version = 2,
                     exportSchema = false)

@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun expenseDao(): ExpenseDao
}