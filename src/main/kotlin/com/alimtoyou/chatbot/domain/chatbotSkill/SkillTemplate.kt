package com.alimtoyou.chatbot.domain.chatbotSkill

import com.alimtoyou.chatbot.domain.chatbotSkill.output.component.Component
import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.button.Button

/**
 * @see <a href="https://i.kakao.com/docs/skill-response-format#skilltemplate">chatbot docs</a>
 */
data class SkillTemplate (
    val outputs: List<Component>,
    val quickReplies: List<Button>?,
) {
    init {
        val maxOutputCount = 3
        val maxQuickReplyCount = 10

        if (outputs.size !in 1..maxOutputCount) {
            throw IllegalArgumentException("The number of outputs should be between 1 and $maxOutputCount.")
        }
        if (quickReplies != null && quickReplies.size > maxQuickReplyCount) {
            throw IllegalArgumentException("The number of quick replies should be less than or equal to $maxQuickReplyCount.")
        }
    }
}

