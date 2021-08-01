package com.ufpe.if718.campibus.core.model.dao

import com.ufpe.if718.campibus.core.model.entities.Card

interface CardDAO {
    fun save(card: Card, studentId: String): Card
    fun getById(cardId: String): Card
    fun getAll(): List<Card>
    fun getAllByStudentId(studentId: String): List<Card>
    fun delete(cardId: String)
}