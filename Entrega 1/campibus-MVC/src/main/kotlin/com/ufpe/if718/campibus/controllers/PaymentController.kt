package com.ufpe.if718.campibus.controllers

import com.ufpe.if718.campibus.dto.MakePaymentDTO
import com.ufpe.if718.campibus.model.GeneralFacade
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/payment")
class PaymentController(private val generalFacade: GeneralFacade) {

    @GetMapping("/makePayment/{studentId}/{cardId}")
    fun makePayment(
            @PathVariable(value = "studentId") studentId : String,
            @PathVariable(value = "cardId") cardId : String,
            model: Model
    ): String {
        val payment = generalFacade.payMonthBilling(cardId, studentId)
        model.addAttribute("payment", payment)
        model.addAttribute("studentId", studentId)
        return "paymentSuccess"
    }

    @GetMapping
    fun getPayments(
        @RequestParam studentId: String,
        model: Model
    ): String {
        val payments = generalFacade.getPayments(studentId)
        model.addAttribute(payments)
        return "payments"
    }

}