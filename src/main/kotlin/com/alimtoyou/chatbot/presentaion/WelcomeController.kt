package com.alimtoyou.chatbot.presentaion

import com.alimtoyou.chatbot.infrastructure.config.CommonImageLinkConfigurationProperties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WelcomeController (
   @Autowired private val commonImageLinkConfigurationProperties: CommonImageLinkConfigurationProperties
) {

    @PostMapping("/welcome")
    fun welcome(): String {
        println(commonImageLinkConfigurationProperties.thumbnail)
        return "good"
    }
}
