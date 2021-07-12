package com.ufpe.if718.campibus.dto

import com.ufpe.if718.campibus.model.entities.Student

data class StudentDTO(
    private var name: String? = null,
    private var age: Int? = null,
    private var school: String? = null,
    private var course: String? = null,
    private var busId: String? = null,
    private var creditCardId: String? = null,
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