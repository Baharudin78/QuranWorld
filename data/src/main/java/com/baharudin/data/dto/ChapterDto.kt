package com.baharudin.data.dto

import com.baharudin.domain.model.Chapter
import com.google.gson.annotations.SerializedName

data class ChapterDto(
    @SerializedName("bismillah_pre")
    val bismillahPre: Boolean,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name_arabic")
    val nameArabic: String,
    @SerializedName("name_complex")
    val nameComplex: String,
    @SerializedName("name_simple")
    val nameSimple: String,
    @SerializedName("revelation_order")
    val revelationOrder: Int,
    @SerializedName("revelation_place")
    val revelationPlace: String,
    @SerializedName("translated_name")
    val translatedName: TranslateName,
    @SerializedName("verses_count")
    val versesCount: Int
)

fun ChapterDto.toChapter() : Chapter {
    return Chapter(
        bismillahPre = bismillahPre,
        id = id,
        nameArabic = nameArabic,
        nameComplex = nameComplex,
        nameSimple = nameSimple,
        revelationOrder = revelationOrder,
        revelationPlace = revelationPlace,
        translatedName = translatedName,
        versesCount = versesCount
    )
}
