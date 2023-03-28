package com.alimtoyou.chatbot.domain.chatbotSkill.output.itemcard

import com.alimtoyou.chatbot.domain.chatbotSkill.output.commonField.Button

/**
 * @see <a href="https://i.kakao.com/docs/skill-response-format#itemcard">chatbot docs</a>
 */
data class ItemCard(
    val thumbnail: Thumbnail?,
    val head: Head?,
    val profile: Profile?,
    val imageTitle: ImageTitle?,
    val itemList: List<ItemList>,
    val itemListAlignment: ItemListAlignment?,
    val itemListSummary: ItemListSummary?,
    val title: String?,
    val description: String?,
    val buttons: List<Button>?,
    val buttonLayout: ButtonLayout?,
) {
    init {
        if (head != null && profile != null) throw Error("head와 profile은 동시에 노출될 수 없습니다.")
        if (description != null && title == null) throw Error("description을 넣는 경우, title이 필수 항목입니다.")
        if (buttonLayout == ButtonLayout.HORIZONTAL && buttons !== null && buttons.size > 2) throw Error("horizontal이면서 버튼이 3개인 경우, 모든 버튼이 미노출됩니다.")
    }
}
