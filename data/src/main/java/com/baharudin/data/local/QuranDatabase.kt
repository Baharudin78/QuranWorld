package com.baharudin.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.baharudin.domain.model.Chapter

@Database(
    entities = [Chapter::class],
    version = 1,
    exportSchema = false
)
abstract class QuranDatabase : RoomDatabase() {
    abstract fun quranDao() : QuranDao
}