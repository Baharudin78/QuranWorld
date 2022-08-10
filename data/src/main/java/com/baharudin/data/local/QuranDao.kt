package com.baharudin.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.baharudin.domain.model.Chapter
import kotlinx.coroutines.flow.Flow

@Dao
interface QuranDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertChapter(chapters : List<Chapter>)
    @Query("SELECT * FROM chapter")
    suspend fun getAllChapter() : List<Chapter>
    @Query("SELECT * FROM chapter WHERE id =:chapterId ")
    suspend fun getChapterById(chapterId : Int) : Flow<Chapter>
}