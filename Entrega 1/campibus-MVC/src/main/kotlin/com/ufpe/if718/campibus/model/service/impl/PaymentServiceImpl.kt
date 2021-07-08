package com.ufpe.if718.campibus.model.service.impl

import com.ufpe.if718.campibus.model.dao.CardDAO
import com.ufpe.if718.campibus.model.dao.PaymentDAO
import com.ufpe.if718.campibus.model.dao.StudentDAO
import com.ufpe.if718.campibus.model.entities.Payment
import com.ufpe.if718.campibus.model.integration.PaymentClient
import com.ufpe.if718.campibus.model.service.PaymentService
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class PaymentServiceImpl(private val paymentDAO: PaymentDAO, private val cardDAO: CardDAO, private val studentDAO: StudentDAO, private val paymentClient: PaymentClient) : PaymentService {

    override fun payMonthBilling(cardId: String, studentId: String): Payment {
        val card = cardDAO.getById(cardId)
        val student = studentDAO.getById(studentId)
        paymentClient.makePayment(card)
        val payment = Payment.Builder().id().amount(50.0).student(student).timestamp(LocalDateTime.now().toString()).build()
        return paymentDAO.save(payment)
    }

    override fun getAllByStudentId(studentId: String): List<Payment> {
        return paymentDAO.getAllByStudentId(studentId)
    }

}