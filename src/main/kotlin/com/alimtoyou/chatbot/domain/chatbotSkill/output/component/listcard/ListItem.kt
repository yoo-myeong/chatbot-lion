package com.alimtoyou.chatbot.domain.chatbotSkill.output.component.listcard

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
            action.value == Action.BLOCK.value &&
            blockId == null
        ) throw Error("block action은 blockId가 필수입니다.")

        if (
            action != null &&
            action.value == Action.MESSAGE.value &&
            messageText == null
        ) throw Error("message action은 messageText가 필수입니다.")
    }
}
