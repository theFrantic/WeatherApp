package com.whilchy.weatherapp

import com.whilchy.weatherapp.extensions.toDateString
import junit.framework.Assert.assertEquals
import org.junit.Test
import java.text.DateFormat

/**
 * Created by daniel on 24/06/2017.
 */

@Test fun testLongToDateString() {
    assertEquals("Oct 19, 2015", 1445275635000L.toDateString())
}

@Test fun testDateStringFullFormat() {
    assertEquals("Monday, October 19, 2015", 1445275635000L.toDateString(DateFormat.FULL))
}