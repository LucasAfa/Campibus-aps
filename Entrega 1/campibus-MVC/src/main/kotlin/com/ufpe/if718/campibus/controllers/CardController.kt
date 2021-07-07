package com.ufpe.if718.campibus.controllers

import com.ufpe.if718.campibus.dto.CardDTO
import com.ufpe.if718.campibus.dto.SaveCardRequest
import com.ufpe.if718.campibus.model.GeneralFacade
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("card")
class CardController(private val generalFacade: GeneralFacade) {

    @PostMapping
    fun saveCard(
        @RequestBody requestBody: SaveCardRequest,
        model: Model
    ): String {

        val cardDomain = generalFacade.saveCard(requestBody.card.buildToDomain(), requestBody.studentId)
        model.addAttribute(cardDomain)
        return "saved-card"
    }

    @GetMapping("{id}")
    fun getCard(
        @PathVariable id: String,
        model: Model
    ): String {
        val card = generalFacade.getCardById(id)
        model.addAttribute(card)
        return "ok-card"
    }

    @GetMapping
    fun getAllCards(
        model: Model
    ): String {
        val cards = generalFacade.getAllCards()
        model.addAttribute(cards)
        return "CardList"
    }

    @DeleteMapping("{id}")
    fun deleteCard(
        @PathVariable id: String,
        model: Model
    ): String {
        generalFacade.deleteCard(id)
        return "cardDeleted"
    }

}