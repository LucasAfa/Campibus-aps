package com.ufpe.if718.campibus.payment.model.dao.impl

import com.ufpe.if718.campibus.payment.model.dao.PaymentDAO
import com.ufpe.if718.campibus.payment.model.dao.repository.PaymentRepository
import com.ufpe.if718.campibus.payment.model.entities.Payment
import org.springframework.stereotype.Component
import java.util.*

@Component
class PaymentDAOImpl(private val paymentRepository: PaymentRepository) : PaymentDAO {

    override fun save(payment: Payment): Payment {
        return paymentRepository.save(payment)
    }

    override fun getAllByStudentId(studentId: String): List<Payment> {
        val id = UUID.fromString(studentId)
        return paymentRepository.getAllByStudentId(id)
    }

}