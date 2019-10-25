package com.astronout.kotpreftest

import com.chibatching.kotpref.KotprefModel

object Profile: KotprefModel() {

    var name by stringPref()
    var age by stringPref()
    var job by stringPref()

}