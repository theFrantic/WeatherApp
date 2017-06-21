package com.whilchy.weatherapp.data.server

import com.whilchy.weatherapp.domain.datasource.ForecastDataSource

import com.whilchy.weatherapp.data.db.ForecastDb
import com.whilchy.weatherapp.domain.model.ForecastList

/**
 * Created by daniel on 21/06/2017.
 */
class ForecastServer(val dataMapper: ServerDataMapper = ServerDataMapper(),
                     val forecastDb: ForecastDb = ForecastDb()) : ForecastDataSource {

    override fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList? {
        val result = ForecastByZipCodeRequest(zipCode).execute()
        val converted = dataMapper.convertToDomain(zipCode, result)
        forecastDb.saveForecast(converted)
        return forecastDb.requestForecastByZipCode(zipCode, date)
    }
}