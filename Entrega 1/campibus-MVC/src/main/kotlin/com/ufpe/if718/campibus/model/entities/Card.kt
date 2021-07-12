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
    public val id: UUID?,
    public val ownerName: String?,
    public val cardholder: String?,
    public val number: String?,
    public val validUntil: String?,
    public val code: String?
) {
    data class Builder(
        public var id: UUID? = null,
        public var ownerName: String? = null,
        public var cardholder: String? = null,
        public var number: String? = null,
        public var validUntil: String? = null,
        public var code: String? = null
    ) {

        fun id() = apply { this.id = UUID.randomUUID() }
        fun ownerName(ownerName: String?) = apply { this.ownerName = ownerName }
        fun cardholder(cardholder: String?) = apply { this.cardholder = cardholder }
        fun number(number: String?) = apply { this.number = number }
        fun validUntil(validUntil: String?) = apply { this.validUntil = validUntil }
        fun code(code: String?) = apply { this.code = code }
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