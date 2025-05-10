package com.example.automotiveassistantkotlin.data.database.dao


import androidx.room.*
import com.example.automotiveassistantkotlin.data.entities.ExpenseEntity
import java.util.Date

@Dao
interface ExpenseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExpense(expense: ExpenseEntity)

    @Update
    suspend fun updateExpense(expense: ExpenseEntity)

    @Query("DELETE FROM expenses WHERE id = :expenseId")
    suspend fun deleteExpenseById(expenseId: Long)

    @Query("""
        SELECT * FROM expenses
        WHERE car_id = :carId
        AND (:fromDate IS NULL OR time_of_creation >= :fromDate)
        AND (:toDate IS NULL OR time_of_creation <= :toDate)
        AND (:category IS NULL OR type = :category)
        ORDER BY time_of_creation DESC
    """)
    suspend fun getExpensesByFilter(
        carId: Long,
        fromDate: Date?,
        toDate: Date?,
        category: String?
    ): List<ExpenseEntity>
}