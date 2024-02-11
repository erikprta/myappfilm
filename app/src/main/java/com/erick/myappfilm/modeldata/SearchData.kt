package com.erick.myappfilm.modeldata

import android.hardware.camera2.TotalCaptureResult
import com.google.gson.annotations.SerializedName

data class SearchData(
    @SerializedName("Search") val data:List<MovieData>,
    @SerializedName("totalResult") val totalData:Int,
    @SerializedName("Response") val res:String
)
