package com.baharudin.data.repository.datasourceimpl

import com.baharudin.data.api.QuranApi
import com.baharudin.data.repository.datasource.QuranRemoteDataSource
import com.baharudin.domain.model.Chapter
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class QuranRemotaDataSourceImpl(
    private val quranApi: QuranApi,
) : QuranRemoteDataSource{
    override suspend fun getAllChapters(): Flow<List<Chapter>> {
        return flow {
            quranApi.getAllChapter()
        }
    }
}