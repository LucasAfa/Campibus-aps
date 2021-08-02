package com.ufpe.if718.campibus.payment.model.dao

import com.ufpe.if718.campibus.payment.model.entities.Payment

interface PaymentDAO {
    fun save(payment: Payment): Payment
    fun getAllByStudentId(studentId: String): List<Payment>
}