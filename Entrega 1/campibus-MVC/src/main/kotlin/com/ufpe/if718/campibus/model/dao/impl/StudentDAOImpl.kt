package com.ufpe.if718.campibus.model.dao.impl

import com.ufpe.if718.campibus.model.dao.StudentDAO
import com.ufpe.if718.campibus.model.dao.repository.StudentRepository
import com.ufpe.if718.campibus.model.entities.Card
import com.ufpe.if718.campibus.model.entities.Student
import org.springframework.stereotype.Component
import java.util.*

@Component
class StudentDAOImpl(private val studentRepository: StudentRepository) : StudentDAO {

    override fun save(student: Student): Student {
        return studentRepository.save(student)
    }

    override fun getById(studentId: String): Student {
        val id = UUID.fromString(studentId)
        return studentRepository.getById(id)
    }

    override fun getAll(): List<Student> {
        return studentRepository.findAll()
    }

    override fun updateById(studentId: String, student: Student): Student {
        val id = UUID.fromString(studentId)
        if(studentRepository.existsById(id)){
            return studentRepository.save(student.copy(id = id))
        }
        return student
    }

    override fun updateCard(studentId: String, card: Card) {
        val id = UUID.fromString(studentId)
        var studentOpt = studentRepository.findById(id)
        if(studentOpt.isPresent){
             studentRepository.save(studentOpt.get().copy(card = card))
        }
    }

    override fun delete(studentId: String) {
        val id = UUID.fromString(studentId)
        return studentRepository.deleteById(id)
    }
}