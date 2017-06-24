package com.whilchy.weatherapp.extensions

import android.content.Context
import android.view.View
import android.widget.TextView

/**
 * Created by daniel on 11/06/17.
 */

val View.ctx: Context get() = context

var TextView.textColor: Int
    get() = currentTextColor
    set(v) = setTextColor(v)

fun View.slideExit() {
    if (translationY == 0f) animate().translationY(-height.toFloat())
}

fun View.slideEnter() {
    if (translationY < 0f) animate().translationY(0f)
}