package com.ufpe.if718.campibus.payment.model.entities

import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "tb_payment")
@Entity
data class Payment private constructor(
    @Id
    @Type(type = "uuid-char")
    private val id: UUID?,
    private val studentId: UUID?,
    private val timestamp: String?,
    private val amount: Double?
) {
    data class Builder(
        private var id: UUID? = null,
        private var studentId: UUID? = null,
        private var timestamp: String? = null,
        private var amount: Double? = null

    ) {
        fun id() = apply { this.id = UUID.randomUUID() }
        fun student(studentId: String) = apply { this.studentId = UUID.fromString(studentId) }
        fun timestamp(timestamp: String) = apply { this.timestamp = timestamp }
        fun amount(amount: Double) = apply { this.amount = amount }
        fun build() = Payment(
            id = id,
            studentId = studentId,
            timestamp = timestamp,
            amount = amount
        )
    }
}