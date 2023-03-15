package com.alimtoyou.chatbot

import com.alimtoyou.chatbot.infrastructure.config.CommonImageLinkConfigurationProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(
    CommonImageLinkConfigurationProperties::class
)
class ChatbotLionApplication

fun main(args: Array<String>) {
    runApplication<ChatbotLionApplication>(*args)
}
