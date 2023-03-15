package com.alimtoyou.chatbot.infrastructure.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "chatbot.config.image-link")
data class CommonImageLinkConfigurationProperties (
    val thumbnail: String
)
