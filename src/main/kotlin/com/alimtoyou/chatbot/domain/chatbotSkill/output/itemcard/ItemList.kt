package com.alimtoyou.chatbot.domain.chatbotSkill.output.itemcard

data class ItemList(
    val title: String,
    val description: String,
) {
    init {
        if (title.length > 6) throw Error("ItemList.title은 최대 6자 입니다.")
    }
}
