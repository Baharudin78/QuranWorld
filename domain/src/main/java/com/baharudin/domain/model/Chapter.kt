package com.baharudin.domain.model

import androidx.room.Entity
import com.baharudin.data.dto.TranslateName
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = "chapter")
data class Chapter(
    val bismillahPre: Boolean,
    val id: Int,
    val nameArabic: String,
    val nameComplex: String,
    val nameSimple: String,
    val revelationOrder: Int,
    val revelationPlace: String,
    val translatedName: TranslateName,
    val versesCount: Int
) : Serializable