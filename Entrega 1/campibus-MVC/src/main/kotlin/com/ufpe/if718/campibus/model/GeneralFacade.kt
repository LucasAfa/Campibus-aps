package com.ufpe.if718.campibus.model

import com.ufpe.if718.campibus.model.entities.Student
import com.ufpe.if718.campibus.model.service.StudentService
import org.springframework.stereotype.Component

@Component
class GeneralFacade(private val studentService: StudentService) {

    // student actions
    fun getStudentById(studentId: String): Student {
        return studentService.getById(studentId)
    }

    fun getAllStudents(): List<Student> {
        return studentService.getAll()
    }

    fun saveStudent(student: Student): Student {
        return studentService.save(student)
    }

    fun updateStudent(studentId: String, student: Student): Student {
        return studentService.updateById(studentId, student)
    }

    fun deleteStudent(studentId: String) {
        return studentService.delete(studentId)
    }

    // other actions

}