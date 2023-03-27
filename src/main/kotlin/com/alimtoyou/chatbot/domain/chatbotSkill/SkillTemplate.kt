package com.alimtoyou.chatbot.domain.chatbotSkill

import com.alimtoyou.chatbot.domain.chatbotSkill.output.Component
import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.Button

/**
 * @see <a href="https://i.kakao.com/docs/skill-response-format#skilltemplate">chatbot docs</a>
 */
data class SkillTemplate (
    val outputs: List<Component>,
    val quickReplies: List<Button>?,
) {
    init {
        if (outputs.size !in 1..3) throw Error()
        if (quickReplies != null && quickReplies.size > 10) throw Error()
    }
}
