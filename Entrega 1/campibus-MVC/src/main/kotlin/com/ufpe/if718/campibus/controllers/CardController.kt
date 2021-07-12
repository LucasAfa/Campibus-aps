package com.ufpe.if718.campibus.controllers

import com.fasterxml.jackson.databind.node.ObjectNode
import com.ufpe.if718.campibus.dto.CardDTO
import com.ufpe.if718.campibus.dto.SaveCardDTO
import com.ufpe.if718.campibus.model.GeneralFacade
import com.ufpe.if718.campibus.model.entities.Card
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/card")
class CardController(private val generalFacade: GeneralFacade) {

    @GetMapping("/addCardForm/{studentId}")
    fun addCardForm(@PathVariable studentId: String, model: Model): String {
        val cardModel = CardDTO().buildToDomain()
        model.addAttribute("cardModel", cardModel)
        model.addAttribute("studentId", studentId)
        return "addCardForm"
    }

    @PostMapping("/saveCard/{studentId}")
    fun saveCard(
            @PathVariable studentId: String,
            requestBody: CardDTO,
            model: Model
    ): String {
        generalFacade.saveCard(requestBody.buildToDomain(), studentId)
        model.addAttribute("studentId", studentId)
        return "cardSaved"
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

    @GetMapping("/cardsList/{studentId}")
    fun getAllCards(
       @PathVariable studentId: String,
       model: Model
    ): String {
        val cards = generalFacade.getAllCards()
        model.addAttribute("cards", cards)
        model.addAttribute("studentId", studentId)
        return "cardsList"
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