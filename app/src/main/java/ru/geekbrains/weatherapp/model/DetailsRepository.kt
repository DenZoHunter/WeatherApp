package ru.geekbrains.weatherapp.model

interface DetailsRepository {
    fun getWeatherDetailsFromServer(
        lat: Double,
        lon: Double,
        callback: retrofit2.Callback<WeatherDTO>
    )
}