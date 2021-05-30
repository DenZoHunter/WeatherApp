package ru.geekbrains.weatherapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class City(
    val city: String,
    val lat: Double, //ширита
    val lon: Double //долгота
) : Parcelable