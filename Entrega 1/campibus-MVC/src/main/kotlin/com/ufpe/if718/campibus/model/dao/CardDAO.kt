package com.ufpe.if718.campibus.model.dao

import com.ufpe.if718.campibus.model.entities.Card

interface CardDAO {
    fun save(card: Card, studentId: String): Card
    fun getById(cardId: String): Card
    fun getAll(): List<Card>
    fun delete(cardId: String)
}