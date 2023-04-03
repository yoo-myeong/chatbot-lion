package com.alimtoyou.chatbot.domain.chatbotSkill.output.component.simpleImage

import com.alimtoyou.chatbot.domain.chatbotSkill.output.component.Component

/**
 * @see <a href="https://i.kakao.com/docs/skill-response-format#simpleimage">chatbot docs</a>
 */
data class SimpleImage(
    val imageUrl: String,
    val altText: String,
) : Component {
    init {
        if (altText.length > 1000) throw Error("SimpleImage.altText는 1000자를 넘을 수 없습니다.")
    }
}
