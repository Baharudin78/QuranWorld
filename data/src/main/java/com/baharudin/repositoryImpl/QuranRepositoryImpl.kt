package com.baharudin.repositoryImpl

import com.baharudin.data.api.QuranApi
import com.baharudin.data.dto.ChapterDto
import com.baharudin.domain.model.Chapter
import com.baharudin.domain.repository.QuranRepository

class QuranRepositoryImpl(
    private val quranApi: QuranApi
) : QuranRepository{
    override suspend fun getAllChapter(): List<ChapterDto> {
        return quranApi.getAllChapter()
    }
}