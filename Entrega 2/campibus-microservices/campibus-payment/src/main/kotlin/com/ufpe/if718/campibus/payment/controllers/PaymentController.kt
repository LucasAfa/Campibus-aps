package com.ufpe.if718.campibus.payment.controllers

import com.ufpe.if718.campibus.payment.dto.MakePaymentDTO
import com.ufpe.if718.campibus.payment.model.GeneralFacade
import com.ufpe.if718.campibus.payment.model.entities.Payment
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/payments")
class PaymentController(private val generalFacade: GeneralFacade) {

    @PostMapping
    fun makePayment(
        @RequestBody requestBody: MakePaymentDTO
    ): Payment {
        return generalFacade.payMonthBilling(requestBody.cardId, requestBody.studentId)
    }

    @GetMapping("{studentId}")
    fun getPayments(
        @PathVariable studentId: String
    ): List<Payment> {
        return generalFacade.getPayments(studentId)
    }

}