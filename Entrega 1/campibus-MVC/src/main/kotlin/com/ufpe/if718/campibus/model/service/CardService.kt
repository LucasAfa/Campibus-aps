package com.ufpe.if718.campibus.model.service

import com.ufpe.if718.campibus.model.entities.Card

interface CardService {
    fun save(card: Card, studentId: String): Card
    fun getById(cardId: String): Card
    fun getAll(): List<Card>
    fun delete(cardId: String)
}