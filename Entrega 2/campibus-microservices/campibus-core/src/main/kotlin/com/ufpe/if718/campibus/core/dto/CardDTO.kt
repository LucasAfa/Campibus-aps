package com.ufpe.if718.campibus.core.dto

import com.ufpe.if718.campibus.core.model.entities.Card

data class CardDTO(
    val ownerName: String? = null,
    val cardholder: String? = null,
    val number: String? = null,
    val validUntil: String? = null,
    val code: String? = null
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