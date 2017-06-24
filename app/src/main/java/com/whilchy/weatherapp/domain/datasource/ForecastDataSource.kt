package com.whilchy.weatherapp.domain.datasource

import com.whilchy.weatherapp.domain.model.Forecast
import com.whilchy.weatherapp.domain.model.ForecastList

/**
 * Created by daniel on 21/06/2017.
 */

interface ForecastDataSource {
    fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList?

    fun requestDayForecast(id: Long): Forecast?
}