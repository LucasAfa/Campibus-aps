package com.ufpe.if718.campibus.core.dto

import com.ufpe.if718.campibus.core.model.entities.Card

data class SaveCardDTO(
    val card: Card,
    val studentId: String? = null
)
