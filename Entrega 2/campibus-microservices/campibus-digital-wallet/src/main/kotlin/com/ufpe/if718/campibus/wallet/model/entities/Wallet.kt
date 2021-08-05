package com.ufpe.if718.campibus.wallet.model.entities

import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "tb_wallet")
@Entity
data class Wallet constructor(
    @Id
    @Type(type = "uuid-char") val id: UUID?,
    val name: String?,
    val age: Int?,
    val school: String?,
    val course: String?,
) {
    data class Builder(
        var id: UUID? = null,
        var name: String? = null,
        var age: Int? = null,
        var school: String? = null,
        var course: String? = null,
    ) {

        fun id() = apply { this.id = UUID.randomUUID() }
        fun name(name: String?) = apply { this.name = name }
        fun age(age: Int?) = apply { this.age = age }
        fun school(school: String?) = apply { this.school = school }
        fun course(course: String?) = apply { this.course = course }
        fun build() = Wallet(
            id = id,
            name = name,
            age = age,
            school = school,
            course = course,
        )
    }
}