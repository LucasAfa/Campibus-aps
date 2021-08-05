package com.ufpe.if718.campibus.core.model.service.impl

import com.ufpe.if718.campibus.core.model.dao.StudentDAO
import com.ufpe.if718.campibus.core.model.entities.Student
import com.ufpe.if718.campibus.core.model.service.StudentService
import com.ufpe.if718.campibus.core.producer.KafkaStudentWalletProducer
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl(private val studentDAO: StudentDAO, private val walletProducer: KafkaStudentWalletProducer) : StudentService {

    override fun save(student: Student): Student {
        val studentSaved = studentDAO.save(student)
        walletProducer.sendUpdateStudentWallet(studentSaved)
        return studentSaved
    }

    override fun getById(studentId: String): Student {
        return studentDAO.getById(studentId)
    }

    override fun getAll(): List<Student> {
        return studentDAO.getAll()
    }

    override fun updateById(studentId: String, student: Student): Student {
        val studentSaved = studentDAO.updateById(studentId, student)
        walletProducer.sendUpdateStudentWallet(studentSaved)
        return studentSaved
    }

    override fun delete(studentId: String) {
        return studentDAO.delete(studentId)
    }

}