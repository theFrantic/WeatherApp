package com.whilchy.weatherapp.domain.commands

import com.whilchy.weatherapp.domain.datasource.ForecastProvider
import com.whilchy.weatherapp.domain.model.ForecastList
import com.whilchy.weatherapp.domain.model.Forecast as ModelForecast

/**
 * Created by daniel on 11/06/17.
 */
class RequestForecastCommand(
        val zipCode: Long,
        val forecastProvider: ForecastProvider = ForecastProvider()) :
        Command<ForecastList> {

    companion object {
        val DAYS = 7
    }

    override fun execute(): ForecastList {
        return forecastProvider.requestByZipCode(zipCode, DAYS)
    }
}
