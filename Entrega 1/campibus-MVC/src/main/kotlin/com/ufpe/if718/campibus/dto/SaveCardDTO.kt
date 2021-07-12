package com.ufpe.if718.campibus.dto

import com.ufpe.if718.campibus.model.entities.Card

data class SaveCardDTO(
        val card: Card,
        val studentId: String? = null
)
