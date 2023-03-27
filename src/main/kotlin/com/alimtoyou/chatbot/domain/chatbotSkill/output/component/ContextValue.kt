package com.alimtoyou.chatbot.domain.chatbotSkill.output.component

/**
 * @see <a href="https://i.kakao.com/docs/skill-response-format#contextvalue-%EC%83%81%EC%84%B8-%ED%95%84%EB%93%9C">chatbot docs</a>
 */
data class ContextValue (
    val name: String,
    val lifeSpan: Int,
    val params: Map <String, String>?,
)
