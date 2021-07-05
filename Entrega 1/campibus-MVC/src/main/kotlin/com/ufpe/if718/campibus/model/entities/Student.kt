package com.ufpe.if718.campibus.model.entities

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "tb_student")
@Entity
data class Student private constructor(
    @Id
    private val id: UUID?,
    private val name: String?,
    private val age: Int?,
    private val school: String?,
    private val course: String?,
    private val busId: String? = null,
    private val creditCardId: String? = null,
) {
    data class Builder(
        private var id: UUID? = null,
        private var name: String? = null,
        private var age: Int? = null,
        private var school: String? = null,
        private var course: String? = null,
        private var busId: String? = null,
        private var creditCardId: String? = null,
    ) {

        fun id() = apply { this.id = UUID.randomUUID() }
        fun name(name: String) = apply { this.name = name }
        fun age(age: Int) = apply { this.age = age }
        fun school(school: String) = apply { this.school = school }
        fun course(course: String) = apply { this.course = course }
        fun busId(busId: String) = apply { this.busId = busId }
        fun creditCardId(creditCardId: String) = apply { this.creditCardId = creditCardId }
        fun build() = Student(
            id = id,
            name = name,
            age = age,
            school = school,
            course = course,
            busId = busId,
            creditCardId = creditCardId
        )
    }
}