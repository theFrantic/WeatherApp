package com.whilchy.weatherapp.extensions

import android.content.Context
import android.support.v4.content.ContextCompat

/**
 * Created by daniel on 24/06/2017.
 */
fun Context.color(res: Int): Int = ContextCompat.getColor(this, res)