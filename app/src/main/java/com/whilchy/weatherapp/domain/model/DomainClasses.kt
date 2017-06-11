package com.whilchy.weatherapp.domain.model

/**
 * Created by daniel on 11/06/17.
 */

data class ForecastList(val city: String, val country: String, val dailyForecast: List<Forecast>)

data class Forecast(val date: String, val description: String, val high: Int, val low: Int)