package com.ufpe.if718.campibus.model

import com.ufpe.if718.campibus.model.entities.Student
import com.ufpe.if718.campibus.model.service.impl.StudentServiceImpl

class GeneralFacade {
    private val studentService = StudentServiceImpl.instance

    companion object {
        val instance = GeneralFacade()
    }

    // student actions
    fun getStudentById(studentId: String): Student {
        return studentService.getById(studentId)
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