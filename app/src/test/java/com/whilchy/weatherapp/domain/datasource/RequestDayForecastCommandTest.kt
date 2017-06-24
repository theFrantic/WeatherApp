package com.whilchy.weatherapp.domain.datasource

import com.whilchy.weatherapp.domain.commands.RequestDayForecastCommand
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

/**
 * Created by daniel on 24/06/2017.
 */
class RequestDayForecastCommandTest {

    @Test
    fun testProviderIsCalled() {
        val forecastProvider = mock(ForecastProvider::class.java)
        val command = RequestDayForecastCommand(2, forecastProvider)

        command.execute()

        verify(forecastProvider).requestForecast(2)
    }
}