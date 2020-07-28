package com.mbullock976.hbdsp.network.response

import com.google.gson.annotations.SerializedName

data class VerseApiResponse (
    val reference: String,
    val text: String,
    @SerializedName("translation_name") val translationName: String
)
{}