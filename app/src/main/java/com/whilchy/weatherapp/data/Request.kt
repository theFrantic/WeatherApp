package com.whilchy.weatherapp.data

import android.util.Log
import java.net.URL

/**
 * Created by daniel on 08/06/17.
 */
class Request(val url: String) {

    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}