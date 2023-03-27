package com.alimtoyou.chatbot.domain.chatbotSkill.output.component.listcard

import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.Button

/**
 * @see <a href="https://i.kakao.com/docs/skill-response-format#listcard">chatbot docs</a>
 */
data class ListCard(
    val header: ListItem,
    val items: List<ListItem>,
    val buttons: List<Button>,
) {
    init {
        if (items.size > 5) throw Error("ListCard.items는 5개를 넘길 수 없습니다.")
        if (buttons.size > 2) throw Error("ListCard.buttons는 2개를 넘길 수 없습니다.")
    }
}
