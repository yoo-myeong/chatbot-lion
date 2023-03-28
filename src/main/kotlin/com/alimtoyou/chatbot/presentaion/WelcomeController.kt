package com.alimtoyou.chatbot.presentaion

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WelcomeController (

) {

    @PostMapping("/welcome")
    fun welcome(): Lion {
        return Lion()
    }

    class Lion {
        val name = "유명선"
        val age = 17
        val context = null

        fun nono():Int {
            return 1
        }
    }
}
