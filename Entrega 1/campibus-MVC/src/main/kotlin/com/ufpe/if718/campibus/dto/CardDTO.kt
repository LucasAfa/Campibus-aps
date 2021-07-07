package com.ufpe.if718.campibus.dto

import com.ufpe.if718.campibus.model.entities.Card
import java.util.*

data class CardDTO(
    private val ownerName: String,
    private val cardholder: String,
    private val number: String,
    private val validUntil: String,
    private val code: String
) {
    fun buildToDomain(): Card {
        return Card.Builder()
            .id()
            .ownerName(this.ownerName)
            .number(this.number)
            .validUntil(this.validUntil)
            .cardholder(this.cardholder)
            .code(this.code)
            .build()

    }
}