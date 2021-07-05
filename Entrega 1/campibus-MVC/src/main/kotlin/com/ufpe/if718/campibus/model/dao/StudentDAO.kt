package com.ufpe.if718.campibus.model.dao

import com.ufpe.if718.campibus.model.entities.Student

interface StudentDAO {
    fun save(student: Student): Student
    fun getById(studentId: String): Student
    fun updateById(studentId: String, student: Student): Student
    fun delete(studentId: String)
}