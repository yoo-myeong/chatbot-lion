package com.alimtoyou.chatbot.domain.chatbotSkill

import com.alimtoyou.chatbot.domain.chatbotSkill.output.component.ContextControl
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 카카오톡 챗봇 스킬 응답 데이터 클래스
 *
 * @see <a href="https://i.kakao.com/docs/skill-response-format#skillresponse">카카오 챗봇 스킬 응답 포맷</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class SkillResponse(
    @JsonProperty("version")
    val version: String = "2.0",

    @JsonProperty("template")
    val template: SkillTemplate,

    @JsonProperty("context")
    val context: ContextControl? = null,

    @JsonProperty("data")
    val data: Map<String, Any>? = null
)
