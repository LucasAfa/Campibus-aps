package com.ufpe.if718.campibus.wallet.model.entities

import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "tb_wallet")
@Entity
data class Wallet private constructor(
    @Id
    @Type(type = "uuid-char")
    private val id: UUID?,
    private var student: String?,
    private var bus: String?
) {
    data class Builder(
        private var id: UUID? = null,
        private var student: String? = null,
        private var bus: String? = null
    ) {
        fun id(studentId: String) = apply { this.id = UUID.fromString(studentId) }
        fun student(student: String) = apply { this.student = student }
        fun bus(bus: String) = apply { this.bus = bus }
        fun build() = Wallet(
            id = id,
            student = student,
            bus = bus
        )
    }
}