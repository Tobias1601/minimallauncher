package com.minimal.launcher

// Ordnet Open-Meteo's WMO-Wettercodes einem von 6 einfachen Icons zu.
object WeatherIcons {
    fun drawableFor(code: Int): Int = when (code) {
        0 -> R.drawable.ic_weather_sun
        1, 2, 3 -> R.drawable.ic_weather_cloud
        45, 48 -> R.drawable.ic_weather_fog
        51, 53, 55, 56, 57,
        61, 63, 65, 66, 67,
        80, 81, 82 -> R.drawable.ic_weather_rain
        71, 73, 75, 77, 85, 86 -> R.drawable.ic_weather_snow
        95, 96, 99 -> R.drawable.ic_weather_storm
        else -> R.drawable.ic_weather_cloud
    }
}
