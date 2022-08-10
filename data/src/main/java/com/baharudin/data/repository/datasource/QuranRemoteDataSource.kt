package com.baharudin.data.repository.datasource

import com.baharudin.domain.model.Chapter
import kotlinx.coroutines.flow.Flow

interface QuranRemoteDataSource {
    suspend fun getAllChapters() : Flow<List<Chapter>>
}