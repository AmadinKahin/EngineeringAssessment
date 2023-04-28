package com.example.utils

import com.example.domain.Company
import com.example.domain.Guest
import com.example.domain.Message
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import lombok.experimental.UtilityClass
import java.io.File
import java.io.FileReader
import java.time.LocalTime

class Utils () {
    val mapper = jacksonObjectMapper()

    fun getGreeting() : String {
        return when(LocalTime.now().hour){
            in 5..11 -> "Good Morning "
            in 12..16 -> "Good Afternoon "
            in 17..22 -> "Good Evening "
            else -> "Good Night "
        }
    }

    fun getGuest(guestId: Int): Guest?{
        val listOfGuests  = mapper.readValue<List<Guest>>(File("./src/main/resources/files/Guests.json").readText())

        return listOfGuests.find { it.id == guestId }
    }

    fun getCompany(companyId: Int): Company?{
        val listOfCompanies  = mapper.readValue<List<Company>>(FileReader("./src/main/resources/files/Companies.json").readText())

        return listOfCompanies.find { it.id == companyId }
    }

    fun getMessage(messageId: Int): Message? {
        val listOfMessages  = mapper.readValue<List<Message>>(FileReader("./src/main/resources/files/Messages.json").readText())

        return listOfMessages.find { it.id == messageId }
    }

}