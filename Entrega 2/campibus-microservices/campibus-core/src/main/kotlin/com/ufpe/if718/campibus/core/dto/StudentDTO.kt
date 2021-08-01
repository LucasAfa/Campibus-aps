package com.ufpe.if718.campibus.core.dto

import com.ufpe.if718.campibus.core.model.entities.Student

data class StudentDTO(
    val name: String? = null,
    val age: Int? = null,
    val school: String? = null,
    val course: String? = null,
    val busId: String? = null,
    val creditCardId: String? = null,
) {
    fun buildToDomain(): Student {
        return Student.Builder()
            .id()
            .name(this.name)
            .age(this.age)
            .course(this.course)
            .school(this.school)
            .build()
    }
}