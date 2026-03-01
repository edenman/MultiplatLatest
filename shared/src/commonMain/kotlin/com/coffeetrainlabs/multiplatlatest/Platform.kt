package com.coffeetrainlabs.multiplatlatest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform