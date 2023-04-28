package com.example.controller

import com.example.service.Service
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class Controller {
val service = Service()

    @PostMapping("sendMessage")
    fun sendMessage( @RequestParam guestId: Int, companyId: Int , messageId: Int){
        service.sendMessage(guestId, companyId, messageId)
    }
}