package com.baharudin.quranworld.di

import android.app.Application
import androidx.room.Room
import com.baharudin.data.local.QuranDao
import com.baharudin.data.local.QuranDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    fun provideDatabase(app : Application) : QuranDatabase =
        Room.databaseBuilder(app, QuranDatabase::class.java, "quran_db").fallbackToDestructiveMigration()
            .build()
    @Provides
    fun provideQuranDao(quranDatabase: QuranDatabase) : QuranDao = quranDatabase.quranDao()

}