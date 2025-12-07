package com.dargoz.util

actual fun generateUUID(): UUID {
    return UUID(java.util.UUID.randomUUID().toString())
}