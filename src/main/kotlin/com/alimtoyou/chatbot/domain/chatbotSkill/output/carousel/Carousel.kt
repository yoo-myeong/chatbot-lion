package com.alimtoyou.chatbot.domain.chatbotSkill.output.carousel

import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.Thumbnail
import com.alimtoyou.chatbot.domain.chatbotSkill.output.component.basiccard.BasicCard
import com.alimtoyou.chatbot.domain.chatbotSkill.output.component.simpleText.SimpleText

class Carousel(
    val type: String,
    val items: List<CarouselItems>
) {}
