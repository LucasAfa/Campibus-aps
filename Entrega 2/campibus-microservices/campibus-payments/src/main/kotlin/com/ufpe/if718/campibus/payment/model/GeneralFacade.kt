package com.ufpe.if718.campibus.payment.model

import com.ufpe.if718.campibus.payment.model.entities.Payment
import com.ufpe.if718.campibus.payment.model.service.PaymentService
import org.springframework.stereotype.Component

@Component
class GeneralFacade(
    private val paymentService: PaymentService
) {

    // payment actions
    fun payMonthBilling(cardId: String, studentId: String): Payment {
        return paymentService.payMonthBilling(cardId, studentId)
    }

    fun getPayments(studentId: String): List<Payment> {
        return paymentService.getAllByStudentId(studentId)
    }
}