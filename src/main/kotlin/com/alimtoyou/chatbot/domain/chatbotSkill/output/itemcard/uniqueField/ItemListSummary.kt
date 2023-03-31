package com.alimtoyou.chatbot.domain.chatbotSkill.output.itemcard.uniqueField

data class ItemListSummary(
    val title: String,
    val description: String,
) {
    init {
        if (title.length > 6) throw Error("ItemListSummary.title은 최대 6자 입니다.")
        if (description.length > 14) throw Error("ItemListSummary.description은 최대 14자 입니다.")
    }
}
