package com.ufpe.if718.campibus.controllers

import com.ufpe.if718.campibus.dto.StudentDTO
import com.ufpe.if718.campibus.model.GeneralFacade
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("payment")
class PaymentController(private val generalFacade: GeneralFacade) {

    @PostMapping
    fun savePayment(
        @RequestBody studentId: String,
        model: Model
    ): String {
        val payment = generalFacade.payMonthBilling(studentId)
        model.addAttribute(payment)
        return "payment-success"
    }

    @GetMapping
    fun getPayments(
        @RequestBody studentId: String,
        model: Model
    ): String {
        val payments = generalFacade.getPayments(studentId)
        model.addAttribute(payments)
        return "payments"
    }

}