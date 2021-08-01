package com.ufpe.if718.campibus.core.model.entities

import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "tb_card")
@Entity
data class Card private constructor(
    @Id
    @Type(type = "uuid-char") val id: UUID?,
    val ownerName: String?,
    val cardholder: String?,
    val number: String?,
    val validUntil: String?,
    val code: String?
) {
    data class Builder(
        var id: UUID? = null,
        var ownerName: String? = null,
        var cardholder: String? = null,
        var number: String? = null,
        var validUntil: String? = null,
        var code: String? = null
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