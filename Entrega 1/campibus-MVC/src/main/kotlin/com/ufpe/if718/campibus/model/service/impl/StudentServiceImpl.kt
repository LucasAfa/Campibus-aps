package com.ufpe.if718.campibus.model.service.impl

import com.ufpe.if718.campibus.model.dao.StudentDAO
import com.ufpe.if718.campibus.model.entities.Student
import com.ufpe.if718.campibus.model.service.StudentService
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl(private val studentDAO: StudentDAO) : StudentService {

    override fun save(student: Student): Student {
        return studentDAO.save(student)
    }

    override fun getById(studentId: String): Student {
        return studentDAO.getById(studentId)
    }

    override fun getAll(): List<Student> {
        return studentDAO.getAll()
    }

    override fun updateById(studentId: String, student: Student): Student {
        return studentDAO.updateById(studentId, student)
    }

    override fun delete(studentId: String) {
        return studentDAO.delete(studentId)
    }

}