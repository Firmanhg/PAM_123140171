package com.firman.tugas1_123140171

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform