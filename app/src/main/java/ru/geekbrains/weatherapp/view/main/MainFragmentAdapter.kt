package ru.geekbrains.weatherapp.view.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.geekbrains.weatherapp.R
import ru.geekbrains.weatherapp.model.Weather

class MainFragmentAdapter(
    private var onItemViewClickListener:
    MainFragment.OnItemViewClickListener?
) :
    RecyclerView.Adapter<MainFragmentAdapter.MainViewHolder>() {

    fun removeListener() {
        onItemViewClickListener = null
    }

    private var weatherData: List<Weather> = listOf()

    fun setWeather(data: List<Weather>) {
        weatherData = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MainViewHolder {
        return MainViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_main_recycler_item, parent, false) as View
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(weatherData[position])
    }

    override fun getItemCount(): Int {
        return weatherData.size
    }

    inner class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(weather: Weather) {
            itemView.apply {
                findViewById<TextView>(R.id.mainFragmentRecyclerItemTextView).text = weather.city.city
                setOnClickListener { onItemViewClickListener?.onItemViewClick(weather) }
            }
        }
    }

}