package com.alimtoyou.chatbot.presentaion

import com.alimtoyou.chatbot.domain.chatbotSkill.SkillResponse
import com.alimtoyou.chatbot.domain.chatbotSkill.SkillTemplate
import com.alimtoyou.chatbot.domain.chatbotSkill.output.component.Component
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.repository.query.Param
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class WelcomeController(
    @Autowired
    private val mongoTemplate:MongoTemplate
) {
    /**
     * TODO: quickReplies는 블록아아디에 따라 조회해서 사용할 수 있도록 기능 추가
     */
    @GetMapping("/scenario")
    fun test(@RequestParam name: String): Any {
        val query = Query(Criteria.where("name").`is`(name))

        /**
         * name 필드에 단일제약조건이 걸려있어
         * 시나리오 이름으로 단일 document를 조회
         */
        val scenarioDoc = mongoTemplate.findOne(query, Map::class.java, "scenario")
            ?: throw IllegalArgumentException("welcome scenario doc is null")

        val outputs = scenarioDoc["outputs"] as List<Component>

        return SkillResponse(template = SkillTemplate(outputs, null))
    }
}
