package com.alimtoyou.chatbot.domain.chatbotSkill.output.component.commerceCard

import com.alimtoyou.chatbot.domain.chatbotSkill.output.Component
import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.Button
import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.Profile
import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.Thumbnail
import com.alimtoyou.chatbot.domain.chatbotSkill.output.component.commerceCard.uniqueField.Currency

/**
 * @see <a href="https://i.kakao.com/docs/skill-response-format#commercecard">chatbot docs</a>
 */
data class CommerceCard(
    val description:String,
    val price:Int,
    val currency: Currency,
    val discount:Int?,
    val discountRate:Int?,
    val discountedPrice:Int?,
    val thumbnails: List<Thumbnail>,
    val profile: Profile?,
    val buttons: List<Button>,
): Component {
    init {
        if (description.length > 40) throw Error("CommerceCard.description은 40자를 넘을 수 없습니다.")
        if (thumbnails.size > 1) throw Error("CommerceCard.description은 40자를 넘을 수 없습니다.")
    }
}
