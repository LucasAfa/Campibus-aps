package com.ufpe.if718.campibus.core.model.dao.impl

import com.ufpe.if718.campibus.core.model.dao.CardDAO
import com.ufpe.if718.campibus.core.model.dao.StudentDAO
import com.ufpe.if718.campibus.core.model.dao.repository.CardRepository
import com.ufpe.if718.campibus.core.model.entities.Card
import org.springframework.stereotype.Component
import java.util.*

@Component
class CardDAOImpl(private val cardRepository: CardRepository, private val studentDAO: StudentDAO) : CardDAO {

    override fun save(card: Card, studentId: String): Card {
        val cardSaved = cardRepository.save(card)
        studentDAO.updateCard(studentId, cardSaved)
        return cardSaved
    }

    override fun getById(cardId: String): Card {
        val id = UUID.fromString(cardId)
        return cardRepository.getById(id)
    }

    override fun getAll(): List<Card> {
        return cardRepository.findAll()
    }

    override fun getAllByStudentId(studentId: String): List<Card> {
        val id = UUID.fromString(studentId)
        return cardRepository.getAllByStudentId(id)
    }

    override fun delete(cardId: String) {
        val id = UUID.fromString(cardId)
        return cardRepository.deleteById(id)
    }
}