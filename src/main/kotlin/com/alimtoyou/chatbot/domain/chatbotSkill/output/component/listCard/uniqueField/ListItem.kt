package com.alimtoyou.chatbot.domain.chatbotSkill.output.component.listCard.uniqueField

import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.link.Link

data class ListItem(
    val title: String,
    val description: String?,
    val imageUrl: String?,
    val link: Link?,
    val action: Action?,
    val blockId: String?,
    val messageText: String?,
    val extra: Map<String, Any>?,
) {
    init {
        if (
            action != null &&
            action == Action.block &&
            blockId == null
        ) throw Error("block action은 blockId가 필수입니다.")

        if (
            action != null &&
            action == Action.message &&
            messageText == null
        ) throw Error("message action은 messageText가 필수입니다.")
    }
}
