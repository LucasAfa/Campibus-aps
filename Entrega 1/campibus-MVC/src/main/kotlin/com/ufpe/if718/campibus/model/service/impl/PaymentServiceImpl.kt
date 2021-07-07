package com.ufpe.if718.campibus.model.service.impl

import com.ufpe.if718.campibus.model.dao.PaymentDAO
import com.ufpe.if718.campibus.model.entities.Payment
import com.ufpe.if718.campibus.model.service.PaymentService
import org.springframework.stereotype.Service

@Service
class PaymentServiceImpl(private val paymentDAO: PaymentDAO) : PaymentService {

    override fun payMonthBilling(studentId: String): Payment {
        TODO("integration")
        //return paymentDAO.save(payment)
    }

    override fun getAllByStudentId(studentId: String): List<Payment> {
        return paymentDAO.getAllByStudentId(studentId)
    }

}