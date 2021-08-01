package com.ufpe.if718.campibus.core.model.service

import com.ufpe.if718.campibus.core.model.entities.Card

interface CardService {
    fun save(card: Card, studentId: String): Card
    fun getById(cardId: String): Card
    fun getAll(): List<Card>
    fun getAllByStudentId(studentId: String): List<Card>
    fun delete(cardId: String)
}