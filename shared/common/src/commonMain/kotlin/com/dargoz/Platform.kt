package com.dargoz

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform