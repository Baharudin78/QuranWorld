package com.baharudin.domain.usecase

import com.baharudin.domain.model.Chapter
import com.baharudin.domain.repository.QuranRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetAllChapterUseCase(
    private val quranRepository: QuranRepository
) {
    operator fun invoke() : Flow<List<Chapter>> = flow {
        try {

        }catch ( e : Exception) {

        }
    }
}