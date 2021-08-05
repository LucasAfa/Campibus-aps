package com.ufpe.if718.campibus.core.producer

import com.fasterxml.jackson.databind.ObjectMapper
import com.ufpe.if718.campibus.core.model.entities.Student
import org.springframework.http.HttpStatus
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component
import org.springframework.web.server.ResponseStatusException

@Component
class KafkaStudentWalletProducer(
    private val sharedKitsKafkaTemplate: KafkaTemplate<String, String>,
    private val mapper: ObjectMapper
) {

    fun sendUpdateStudentWallet(student: Student) {
        try {
            val contentJson = mapper!!.writeValueAsString(student)
            sharedKitsKafkaTemplate!!.send("student.wallet", contentJson)
        } catch (e: Exception) {
            throw ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }
}