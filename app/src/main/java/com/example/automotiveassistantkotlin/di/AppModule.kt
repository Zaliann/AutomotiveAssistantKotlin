package com.example.automotiveassistantkotlin.di

import android.app.Application
import androidx.room.Room
import com.example.automotiveassistantkotlin.data.database.db.AppDatabase
import com.example.automotiveassistantkotlin.data.repositories.ExpenseRepositoryImpl
import com.example.automotiveassistantkotlin.domain.repositories.ExpenseRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): AppDatabase {
        return Room.databaseBuilder(app, AppDatabase::class.java, "app_database")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideExpenseDao(db: AppDatabase) = db.expenseDao()

    @Provides
    @Singleton
    fun provideExpenseRepository(dao: com.example.automotiveassistantkotlin.data.database.dao.ExpenseDao): ExpenseRepository {
        return ExpenseRepositoryImpl(dao)
    }
}