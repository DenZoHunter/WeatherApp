package ru.geekbrains.weatherapp.model

import ru.geekbrains.weatherapp.model.FactDTO
import ru.geekbrains.weatherapp.model.Weather
import ru.geekbrains.weatherapp.model.WeatherDTO
import ru.geekbrains.weatherapp.model.getDefaultCity

fun convertDtoToModel (weatherDTO: WeatherDTO): List<Weather> {
    val fact: FactDTO = weatherDTO.fact!!
    return listOf(Weather(getDefaultCity(), fact.temp!!, fact.feels_like!!, fact.condition!!))
}