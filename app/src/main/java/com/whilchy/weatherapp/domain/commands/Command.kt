package com.whilchy.weatherapp.domain.commands

/**
 * Created by daniel on 11/06/17.
 */
interface Command<out T> {
    fun execute(): T
}