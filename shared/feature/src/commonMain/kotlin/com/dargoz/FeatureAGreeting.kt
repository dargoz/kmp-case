package com.dargoz

class FeatureAGreeting {

    fun getMessage(): String {
        return "${Greeting().greet()} This is Feature A"
    }

}