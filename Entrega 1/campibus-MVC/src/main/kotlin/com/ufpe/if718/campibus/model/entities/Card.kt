package com.ufpe.if718.campibus.model.entities

import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "tb_card")
@Entity
data class Card private constructor(
    @Id
    @Type(type="uuid-char")
    private val id: UUID?,
    private val ownerName: String?,
    private val cardholder: String?,
    private val number: String?,
    private val validUntil: String?,
    private val code: String?
) {
    data class Builder(
        private var id: UUID? = null,
        private var ownerName: String? = null,
        private var cardholder: String? = null,
        private var number: String? = null,
        private var validUntil: String? = null,
        private var code: String? = null
    ) {

        fun id() = apply { this.id = UUID.randomUUID() }
        fun ownerName(ownerName: String) = apply { this.ownerName = ownerName }
        fun cardholder(cardholder: String) = apply { this.cardholder = cardholder }
        fun number(number: String) = apply { this.number = number }
        fun validUntil(validUntil: String) = apply { this.validUntil = validUntil }
        fun code(code: String) = apply { this.code = code }
        fun build() = Card(
            id = this.id,
            ownerName = ownerName,
            cardholder = cardholder,
            number = number,
            validUntil = validUntil,
            code = code
        )
    }
}