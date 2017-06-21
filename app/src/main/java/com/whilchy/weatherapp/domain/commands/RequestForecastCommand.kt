package com.whilchy.weatherapp.domain.commands

import com.whilchy.weatherapp.data.server.ForecastRequest
import com.whilchy.weatherapp.domain.mappers.ForecastDataMapper
import com.whilchy.weatherapp.domain.model.ForecastList
import com.whilchy.weatherapp.domain.model.Forecast as ModelForecast

/**
 * Created by daniel on 11/06/17.
 */
class RequestForecastCommand(private val zipCode: Long) : Command<ForecastList> {

    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(zipCode, forecastRequest.execute())
    }
}