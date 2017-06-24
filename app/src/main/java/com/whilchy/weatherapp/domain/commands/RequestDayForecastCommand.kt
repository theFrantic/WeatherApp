package com.whilchy.weatherapp.domain.commands

import com.whilchy.weatherapp.domain.datasource.ForecastProvider
import com.whilchy.weatherapp.domain.model.Forecast

/**
 * Created by daniel on 24/06/2017.
 */
class RequestDayForecastCommand(
        val id: Long,
        val forecastProvider: ForecastProvider = ForecastProvider()) :
        Command<Forecast> {

    override fun execute() = forecastProvider.requestForecast(id)
}