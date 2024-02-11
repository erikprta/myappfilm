package com.erick.myappfilm.modeldata

import com.google.gson.annotations.SerializedName

data class MovieDetailData(

    val Year:String,
    val Title:String,
    @SerializedName("Released") val rilis:String,
    @SerializedName("Poster") val gambar:String,

)
