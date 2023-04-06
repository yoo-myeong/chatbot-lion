package com.alimtoyou.chatbot.presentaion

import com.alimtoyou.chatbot.domain.chatbotSkill.SkillResponse
import com.alimtoyou.chatbot.domain.chatbotSkill.SkillTemplate
import com.alimtoyou.chatbot.domain.chatbotSkill.output.component.Component
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WelcomeController(
    @Autowired
    private val mongoTemplate:MongoTemplate
) {
    @GetMapping("/welcome")
    fun test(): Any {
        val query = Query(Criteria.where("name").`is`("welcome"))
        val scenarioDoc = mongoTemplate.findOne(query, Map::class.java, "scenario")
            ?: throw IllegalArgumentException("welcome scenario doc is null")

        val outputs = scenarioDoc["outputs"] as List<Component>

        return SkillResponse(template = SkillTemplate(outputs, null))
    }
}
