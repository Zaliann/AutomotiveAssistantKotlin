package com.example.automotiveassistantkotlin.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.automotiveassistantkotlin.domain.entities.ExpenseModel
import kotlinx.coroutines.flow.Flow

@Dao
interface ExpenseDao {
    @Query("SELECT * FROM expenses WHERE car_id = :carId")
    fun getExpensesByCarId(carId: Long): Flow<List<ExpenseModel>>
}
