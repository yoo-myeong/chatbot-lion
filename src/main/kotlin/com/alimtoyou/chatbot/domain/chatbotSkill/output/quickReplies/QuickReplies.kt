package com.alimtoyou.chatbot.domain.chatbotSkill.output.quickReplies

data class QuickReplies(
    val label: String,
    val action: QuickRepliesAction,
    val messageText: String,
    val blockId: String,
    val extra: Any?,
){
    init {
        if (action == QuickRepliesAction.block && blockId == null) throw Error("block action은 blockId가 필수입니다.")
    }
}
