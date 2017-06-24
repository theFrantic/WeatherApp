package com.whilchy.weatherapp.extensions

import java.text.DateFormat
import java.util.*

/**
 * Created by daniel on 24/06/2017.
 */
fun Long.toDateString(dateFormat: Int = DateFormat.MEDIUM): String {
    val df = DateFormat.getDateInstance(dateFormat, Locale.getDefault())
    return df.format(this)
}