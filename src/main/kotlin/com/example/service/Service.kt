package com.example.service

import com.example.utils.Utils
import org.springframework.stereotype.Service

@Service
class Service() {
    val utils = Utils()

    fun sendMessage(guestId : Int, companyId : Int, messageId: Int): String  {
        val greetingMessage = utils.getGreeting()
        val guest = utils.getGuest(guestId)
        val company = utils.getCompany(companyId)
        val message = utils.getMessage(messageId)

        val returnedMessage = greetingMessage + guest?.firstName.toString() + message?.message.toString() + company?.company.toString()
        println(returnedMessage)
        return returnedMessage
    }
}