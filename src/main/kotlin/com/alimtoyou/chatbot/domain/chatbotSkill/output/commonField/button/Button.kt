package com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.button

data class Button(
    val label: String,
    val action: ButtonAction,
    val webLinkUrl: String?,
    val messageText: String?,
    val phoneNumber: String?,
    val blockId: String?,
    val extra: Map<String, Any>?,
){
    init {
        if (action == ButtonAction.webLink && webLinkUrl == null) throw Error("webLink action은 webLinkUrl이 필수입니다.")
        if (
            (action == ButtonAction.message || action == ButtonAction.block) &&
            messageText == null
        ) throw Error("message or block action은 messageText가 필수입니다.")
        if (action == ButtonAction.phone && phoneNumber == null) throw Error("phone action은 phoneNumber가 필수입니다.")
        if (action == ButtonAction.block && blockId == null) throw Error("block action은 blockId가 필수입니다.")
    }
}
