package com.whilchy.weatherapp.ui

import android.app.Application
import com.whilchy.weatherapp.ui.utils.DelegatesExt

/**
 * Created by daniel on 11/06/17.
 */

class App : Application() {

    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()      // it could be done with lateinit too (and also is a simple option)
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}
