package com.dargoz

import kotlin.test.Test
import kotlin.test.assertEquals


class FeatureBGreetingTest {

    @Test
    fun getMessageTest() {
        val featureA = FeatureBGreeting()
        assertEquals("Hello, Java 17.0.8.1! This is Feature B", featureA.getMessage())
    }


}