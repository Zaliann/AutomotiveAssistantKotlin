package com.example.automotiveassistantkotlin.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

// Tip Entity
@Entity(tableName = "tips")
data class TipEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val text: String
)