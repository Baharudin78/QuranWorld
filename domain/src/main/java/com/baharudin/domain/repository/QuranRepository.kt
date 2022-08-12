package com.baharudin.domain.repository

import com.baharudin.data.dto.ChapterDto

interface QuranRepository {
    suspend fun getAllChapter() : List<ChapterDto>
}