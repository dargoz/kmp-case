package com.dargoz

class FeatureBGreeting {

    fun getMessage(): String {
        return "${Greeting().greet()} This is Feature B"
    }

}