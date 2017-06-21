package com.whilchy.weatherapp.extensions

/**
 * Created by daniel on 21/06/2017.
 */
fun <K, V : Any> Map<K, V?>.toVarargArray(): Array<out Pair<K, V>> =
        map({ Pair(it.key, it.value!!) }).toTypedArray()