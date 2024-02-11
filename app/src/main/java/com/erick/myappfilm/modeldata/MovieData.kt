package com.erick.myappfilm.modeldata

import android.icu.text.CaseMap.Title
import com.google.gson.annotations.SerializedName

data class MovieData (
    val Year:String,
    val Title:String,
    @SerializedName("Poster") val gambar:String,
    @SerializedName("imdbID") val idmovie:String ,
)