package com.baharudin.data.api

import com.baharudin.data.dto.ChapterDto
import retrofit2.http.GET

interface QuranApi {
    @GET("api/v4/chapters")
    suspend fun getAllChapter() : List<ChapterDto>
}