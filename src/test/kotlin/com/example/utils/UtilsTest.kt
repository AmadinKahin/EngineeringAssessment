package com.example.utils

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.time.LocalDateTime

 class UtilsTest {

    @Test
    fun getGreeting() {
        val greeting = Utils().getGreeting()

        assert(greeting.equals("Good Afternoon "))
    }

    @Test
    fun getGuest() {
        val getGuest = Utils().getGuest(1)
        assert(getGuest?.firstName.equals("Candy"))
    }

    @Test
    fun getCompany() {
        val getCompany = Utils().getCompany(1)
        assert(getCompany?.company.equals("Hotel California"))
    }

    @Test
    fun getMessage() {
        val getMessage = Utils().getMessage(1)
        assert(getMessage?.message.equals(" We look forward to your stay with us at "))
    }
}