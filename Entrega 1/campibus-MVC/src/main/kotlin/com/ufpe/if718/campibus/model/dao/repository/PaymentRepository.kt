package com.ufpe.if718.campibus.model.dao.repository

import com.ufpe.if718.campibus.model.entities.Payment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PaymentRepository : JpaRepository<Payment, UUID> {
}