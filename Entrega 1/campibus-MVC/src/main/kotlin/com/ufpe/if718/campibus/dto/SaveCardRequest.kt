package com.ufpe.if718.campibus.dto

data class SaveCardRequest(
    val card: CardDTO,
    val studentId: String
)
