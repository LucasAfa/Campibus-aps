package com.ufpe.if718.campibus.core.model.service.impl

import com.ufpe.if718.campibus.core.model.dao.CardDAO
import com.ufpe.if718.campibus.core.model.entities.Card
import com.ufpe.if718.campibus.core.model.service.CardService
import org.springframework.stereotype.Service

@Service
class CardServiceImpl(private val cardDAO: CardDAO) : CardService {

    override fun save(card: Card, studentId: String): Card {
        return cardDAO.save(card, studentId)
    }

    override fun getById(cardId: String): Card {
        return cardDAO.getById(cardId)
    }

    override fun getAll(): List<Card> {
        return cardDAO.getAll()
    }

    override fun delete(cardId: String) {
        return cardDAO.delete(cardId)
    }

}