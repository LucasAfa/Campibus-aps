package com.ufpe.if718.campibus.core.model.entities

import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToOne
import javax.persistence.Table

@Table(name = "tb_student")
@Entity
data class Student private constructor(
    @Id
    @Type(type = "uuid-char") val id: UUID?,
    val name: String?,
    val age: Int?,
    val school: String?,
    val course: String?,
    val busId: String? = null,
    @OneToOne val card: Card? = null,
) {
    data class Builder(
        var id: UUID? = null,
        var name: String? = null,
        var age: Int? = null,
        var school: String? = null,
        var course: String? = null,
        var busId: String? = null,
        var card: Card? = null,
    ) {

        fun id() = apply { this.id = UUID.randomUUID() }
        fun name(name: String?) = apply { this.name = name }
        fun age(age: Int?) = apply { this.age = age }
        fun school(school: String?) = apply { this.school = school }
        fun course(course: String?) = apply { this.course = course }
        fun busId(busId: String) = apply { this.busId = busId }
        fun card(card: Card) = apply { this.card = card }
        fun build() = Student(
            id = id,
            name = name,
            age = age,
            school = school,
            course = course,
            busId = busId,
            card = card
        )
    }
}