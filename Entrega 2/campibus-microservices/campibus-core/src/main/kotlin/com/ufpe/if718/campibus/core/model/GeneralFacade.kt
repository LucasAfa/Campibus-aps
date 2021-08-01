package com.ufpe.if718.campibus.core.model

import com.ufpe.if718.campibus.core.model.entities.Card
import com.ufpe.if718.campibus.core.model.entities.Student
import com.ufpe.if718.campibus.core.model.service.CardService
import com.ufpe.if718.campibus.core.model.service.StudentService
import org.springframework.stereotype.Component

@Component
class GeneralFacade(
    private val studentService: StudentService,
    private val cardService: CardService
) {

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


    // card actions
    fun getCardById(cardId: String): Card {
        return cardService.getById(cardId)
    }

    fun getAllCards(): List<Card> {
        return cardService.getAll()
    }

    fun getAllByStudentId(studentId: String): List<Card> {
        return cardService.getAllByStudentId(studentId)
    }

    fun saveCard(card: Card, studentId: String): Card {
        return cardService.save(card, studentId)
    }

    fun deleteCard(cardId: String) {
        return cardService.delete(cardId)
    }

}