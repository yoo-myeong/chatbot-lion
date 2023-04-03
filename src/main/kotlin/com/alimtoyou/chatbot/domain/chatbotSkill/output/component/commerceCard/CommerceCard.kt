package com.alimtoyou.chatbot.domain.chatbotSkill.output.component.commerceCard

import com.alimtoyou.chatbot.domain.chatbotSkill.output.component.Component
import com.alimtoyou.chatbot.domain.chatbotSkill.output.carousel.CarouselItems
import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.button.Button
import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.profile.Profile
import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.thumbnail.Thumbnail
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
): Component, CarouselItems {
    init {
        if (description.length > 40) throw Error("CommerceCard.description은 40자를 넘을 수 없습니다.")
        if (thumbnails.size > 1) throw Error("CommerceCard.description은 40자를 넘을 수 없습니다.")
    }
}
