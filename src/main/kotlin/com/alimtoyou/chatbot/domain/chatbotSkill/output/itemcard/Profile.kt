package com.alimtoyou.chatbot.domain.chatbotSkill.output.itemcard

data class Profile(
    val imageUrl: String?,
    val width: Number?,
    val height: Number?,
    val title: String,
){
    init {
        if (title.length > 6) throw Error("Profile.title은 최대 15자 입니다.")
    }
}
