package com.ufpe.if718.campibus.dto

import com.ufpe.if718.campibus.model.entities.Card

data class CardDTO(
    private var ownerName: String? = null,
    private var cardholder: String? = null,
    private var number: String? = null,
    private var validUntil: String? = null,
    private var code: String? = null
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