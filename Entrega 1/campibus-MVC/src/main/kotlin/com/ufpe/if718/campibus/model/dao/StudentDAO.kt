package com.ufpe.if718.campibus.model.dao

import com.ufpe.if718.campibus.model.entities.Card
import com.ufpe.if718.campibus.model.entities.Student

interface StudentDAO {
    fun save(student: Student): Student
    fun getById(studentId: String): Student
    fun getAll(): List<Student>
    fun updateById(studentId: String, student: Student): Student
    fun updateCard(studentId: String, card: Card)
    fun delete(studentId: String)
}