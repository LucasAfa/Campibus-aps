package com.ufpe.if718.campibus.payment.model.service.impl

import com.ufpe.if718.campibus.payment.model.dao.PaymentDAO
import com.ufpe.if718.campibus.payment.model.entities.Payment
import com.ufpe.if718.campibus.payment.model.integration.PaymentClient
import com.ufpe.if718.campibus.payment.model.service.PaymentService
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class PaymentServiceImpl(private val paymentDAO: PaymentDAO, private val paymentClient: PaymentClient) :
    PaymentService {

    override fun payMonthBilling(cardId: String, studentId: String): Payment {
        paymentClient.makePayment(cardId)
        val payment =
            Payment.Builder().id().amount(50.0).student(studentId).timestamp(LocalDateTime.now().toString()).build()
        return paymentDAO.save(payment)
    }

    override fun getAllByStudentId(studentId: String): List<Payment> {
        return paymentDAO.getAllByStudentId(studentId)
    }

}