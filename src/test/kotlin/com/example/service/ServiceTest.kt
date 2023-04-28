package com.example.service

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

 class ServiceTest {

    @Test
    fun sendMessage() {
        val testMessage = Service().sendMessage(1,1,1)
        assertEquals(testMessage.toString(),"Good Afternoon Candy We look forward to your stay with us at Hotel California" )
    }
}