package com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.thumbnail

import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.link.Link

data class Thumbnail(
    val imageUrl: String,
    val link: Link?,
    val fixedRatio: Boolean = false,
    val width: Number?,
    val height: Number?,
) {
    init {
        if (fixedRatio && (width == null || height == null)) {
            throw Error("fixedRatio가 true면 width와 height는 필수입니다.")
        }
    }
}
