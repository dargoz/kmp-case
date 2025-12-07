package com.dargoz

actual fun getPlatform(): Platform {
    return object: Platform {
        override val name: String
            get() = "Javascript"

    }
}