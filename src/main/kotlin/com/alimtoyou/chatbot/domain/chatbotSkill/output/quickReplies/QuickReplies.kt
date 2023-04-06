package com.alimtoyou.chatbot.domain.chatbotSkill.output.quickReplies

data class QuickReplies(
    val label: String,
    val action: QuickRepliesAction,
    val messageText: String,
    val blockId: String?,
    val extra: Map<String, Any> = emptyMap()
) {
    init {
        if (action == QuickRepliesAction.block && blockId == null) {
            throw IllegalArgumentException("block action에는 blockId가 필수입니다.")
        }
    }
}
