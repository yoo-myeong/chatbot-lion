package com.alimtoyou .chatbot.domain.chatbotSkill

import com.alimtoyou.chatbot.domain.chatbotSkill.SkillTemplate
import com.alimtoyou.chatbot.domain.chatbotSkill.output.component.Component
import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.Button
import com.alimtoyou.chatbot.domain.chatbotSkill.output.component.ContextControl

/**
 * @see <a href="https://i.kakao.com/docs/skill-response-format#skillresponse">chatbot docs</a>
 */
data class SkillResponse(
    val outputs: List<Component>,
    val quickReplies: List<Button>?,
) {
    val version = "2.0"
    val template = SkillTemplate(outputs, quickReplies)
    val context: ContextControl? = null
    val data: Map<String, Any>? = null
}
