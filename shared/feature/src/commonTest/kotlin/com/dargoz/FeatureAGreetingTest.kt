package com.dargoz

import kotlin.test.Test
import kotlin.test.assertEquals


class FeatureAGreetingTest {

    @Test
    fun getMessageTest() {
        val featureA = FeatureAGreeting()
        assertEquals("Hello, Java 17.0.8.1! This is Feature A", featureA.getMessage())
    }


}