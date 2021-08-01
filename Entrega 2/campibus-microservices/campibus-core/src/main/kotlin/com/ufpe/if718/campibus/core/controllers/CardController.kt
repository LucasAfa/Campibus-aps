package com.ufpe.if718.campibus.core.controllers

import com.ufpe.if718.campibus.core.dto.SaveCardDTO
import com.ufpe.if718.campibus.core.model.GeneralFacade
import com.ufpe.if718.campibus.core.model.entities.Card
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cards")
class CardController(private val generalFacade: GeneralFacade) {

    @PostMapping
    fun saveCard(
        @RequestBody requestBody: SaveCardDTO
    ): Card {
        return generalFacade.saveCard(requestBody.card.buildToDomain(), requestBody.studentId)
    }

    @GetMapping("{id}")
    fun getCard(
        @PathVariable id: String
    ): Card {
        return generalFacade.getCardById(id)
    }

    @GetMapping
    fun getAllCards(): List<Card> {
        return generalFacade.getAllCards()
    }

    @GetMapping("student/{studentId}")
    fun getAllCards(
        @PathVariable studentId: String
    ): List<Card> {
        return generalFacade.getAllByStudentId(studentId)
    }

    @DeleteMapping("{id}")
    fun deleteCard(
        @PathVariable id: String
    ) {
        generalFacade.deleteCard(id)
    }

}