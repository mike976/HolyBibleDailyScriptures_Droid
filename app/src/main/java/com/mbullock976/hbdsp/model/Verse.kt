package com.mbullock976.hbdsp.model

import com.google.gson.annotations.SerializedName

open class Verse (
    @SerializedName("reference") val reference: String = "",
    @SerializedName("text") val text: String = "",
    @SerializedName("translation_name") val translatioName: String = ""

) {
}