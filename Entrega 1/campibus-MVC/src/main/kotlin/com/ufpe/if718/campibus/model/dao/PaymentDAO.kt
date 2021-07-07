package com.ufpe.if718.campibus.model.dao

import com.ufpe.if718.campibus.model.entities.Payment

interface PaymentDAO {
    fun save(payment: Payment): Payment
    fun getAllByStudentId(studentId: String): List<Payment>
}