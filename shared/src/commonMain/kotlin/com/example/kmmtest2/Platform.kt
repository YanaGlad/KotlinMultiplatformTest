package com.example.kmmtest2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform