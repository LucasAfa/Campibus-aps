package com.ufpe.if718.campibus.model.service.impl

import com.ufpe.if718.campibus.model.entities.Student
import com.ufpe.if718.campibus.model.repository.StudentRepository
import com.ufpe.if718.campibus.model.service.StudentService
import org.springframework.stereotype.Service
import java.util.*

@Service
class StudentServiceImpl : StudentService {

    private val studentRepository: StudentRepository = TODO()

    companion object {
        val instance = StudentServiceImpl()
    }

    override fun save(student: Student): Student {
        return studentRepository.save(student)
    }

    override fun getById(studentId: String): Student {
        val id = UUID.fromString(studentId)
        return studentRepository.getById(id)
    }

    override fun updateById(studentId: String, student: Student): Student {
        val id = UUID.fromString(studentId)
        TODO()
    }

    override fun delete(studentId: String) {
        val id = UUID.fromString(studentId)
        return studentRepository.deleteById(id)
    }

}