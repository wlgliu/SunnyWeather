package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse (
    val status: String,
    val places: List<Places>
)

data class Places (
    val name: String,
    @SerializedName("formatted_address") val address: String,
    val location: Location
)

data class Location (
    val lat: Double,
    val lng: Double
)



