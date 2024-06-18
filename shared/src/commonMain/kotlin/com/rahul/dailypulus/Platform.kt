package com.rahul.dailypulus

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform