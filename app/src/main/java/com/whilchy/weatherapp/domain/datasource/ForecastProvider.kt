package com.whilchy.weatherapp.domain.datasource

import com.whilchy.weatherapp.data.db.ForecastDb
import com.whilchy.weatherapp.data.server.ForecastServer
import com.whilchy.weatherapp.domain.model.Forecast
import com.whilchy.weatherapp.domain.model.ForecastList
import com.whilchy.weatherapp.extensions.firstResult

/**
 * Created by daniel on 21/06/2017.
 */

class ForecastProvider(val sources: List<ForecastDataSource> = ForecastProvider.SOURCES) {

    companion object {
        val DAY_IN_MILLIS = 1000 * 60 * 60 * 24
        val SOURCES by lazy { listOf(ForecastDb(), ForecastServer()) }      // only created if they needed
    }

    fun requestByZipCode(zipCode: Long, days: Int): ForecastList = requestToSources {
        val res = it.requestForecastByZipCode(zipCode, todayTimeSpan())
        if (res != null && res.size >= days) res else null
    }

    fun requestForecast(id: Long): Forecast = requestToSources { it.requestDayForecast(id) }

    private fun todayTimeSpan() = System.currentTimeMillis() / DAY_IN_MILLIS * DAY_IN_MILLIS

    private fun <T : Any> requestToSources(
            f: (ForecastDataSource) -> T?): T = sources.firstResult { f(it) }

}