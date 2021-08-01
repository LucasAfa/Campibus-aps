package com.ufpe.if718.campibus.payment.model.dao.repository

import com.ufpe.if718.campibus.payment.model.entities.Payment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PaymentRepository : JpaRepository<Payment, UUID> {
    @Query(value = "SELECT p FROM Payment p WHERE p.id = id ")
    fun getAllByStudentId(id: UUID): List<Payment>
}