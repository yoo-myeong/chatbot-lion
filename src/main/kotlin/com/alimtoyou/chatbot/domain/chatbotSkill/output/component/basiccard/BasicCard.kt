package com.alimtoyou.chatbot.domain.chatbotSkill.output.component.basiccard

import com.alimtoyou.chatbot.domain.chatbotSkill.output.component.Component
import com.alimtoyou.chatbot.domain.chatbotSkill.output.carousel.CarouselItems
import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.button.Button
import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.thumbnail.Thumbnail

/**
 * @see <a href="https://i.kakao.com/docs/skill-response-format#basiccard">chatbot docs</a>
 */
data class BasicCard(
    val title: String?,
    val description: String?,
    val thumbnail: Thumbnail,
    val buttons: List<Button>,
) : Component, CarouselItems {
    init {
        if (description != null && description.length > 236) throw Error("BasicCard.description은 236자를 넘길 수 없습니다.")
    }
}
