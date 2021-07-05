package com.ufpe.if718.campibus.dto

import com.ufpe.if718.campibus.model.entities.Student

class StudentDTO(
    private var name: String,
    private var age: Int,
    private var school: String,
    private var course: String,
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