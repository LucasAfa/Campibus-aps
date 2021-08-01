package com.ufpe.if718.campibus.core.model.service

import com.ufpe.if718.campibus.core.model.entities.Student

interface StudentService {
    fun save(student: Student): Student
    fun getById(studentId: String): Student
    fun getAll(): List<Student>
    fun updateById(studentId: String, student: Student): Student
    fun delete(studentId: String)
}