package com.baharudin.data.dto

import com.google.gson.annotations.SerializedName

data class TranslateName(
    @SerializedName("language_name")
    val languageName : String,
    val name : String
)
