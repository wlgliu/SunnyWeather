package com.sunnyweather.android.logic.dao

import android.content.Context
import com.google.gson.Gson
import androidx.core.content.edit
import com.sunnyweather.android.SunnyWeatherApplication
import com.sunnyweather.android.logic.model.Places

object PlaceDao {

    fun savePlace(place: Places) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace() : Places {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Places::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() = SunnyWeatherApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)


}