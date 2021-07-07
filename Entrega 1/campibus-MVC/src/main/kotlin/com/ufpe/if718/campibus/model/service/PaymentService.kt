package com.ufpe.if718.campibus.model.service

import com.ufpe.if718.campibus.model.entities.Payment

interface PaymentService {
    fun payMonthBilling(studentId: String): Payment
    fun getAllByStudentId(studentId: String): List<Payment>
}