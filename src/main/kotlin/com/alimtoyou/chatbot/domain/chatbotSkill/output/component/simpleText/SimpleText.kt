package com.alimtoyou.chatbot.domain.chatbotSkill.output.component.simpleText

import com.alimtoyou.chatbot.domain.chatbotSkill.output.Component

/**
 * @see <a href="https://i.kakao.com/docs/skill-response-format#simpletext">chatbot docs</a>
 */
data class SimpleText(
    val text: String,
): Component {
    init {
        if (text.length > 1000) throw Error("SimpleText.text 최대길이는 1000자 입니다.")
    }
}
