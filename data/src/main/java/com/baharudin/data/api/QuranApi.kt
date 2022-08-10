package com.baharudin.data.api

import com.baharudin.domain.model.ChapterResponse
import retrofit2.Response
import retrofit2.http.GET

interface QuranApi {
    @GET("api/v4/chapters")
    suspend fun getAllChapter() : Response<ChapterResponse>
}