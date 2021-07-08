package com.ufpe.if718.campibus.model

import com.ufpe.if718.campibus.model.entities.Card
import com.ufpe.if718.campibus.model.entities.Payment
import com.ufpe.if718.campibus.model.entities.Student
import com.ufpe.if718.campibus.model.service.CardService
import com.ufpe.if718.campibus.model.service.PaymentService
import com.ufpe.if718.campibus.model.service.StudentService
import org.springframework.stereotype.Component

@Component
class GeneralFacade(
    private val studentService: StudentService,
    private val cardService: CardService,
    private val paymentService: PaymentService
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

    fun saveCard(card: Card, studentId: String): Card {
        return cardService.save(card, studentId)
    }

    fun deleteCard(cardId: String) {
        return cardService.delete(cardId)
    }

    // payment actions
    fun payMonthBilling(cardId: String, studentId: String): Payment {
        return paymentService.payMonthBilling(cardId, studentId)
    }

    fun getPayments(studentId: String): List<Payment> {
        return paymentService.getAllByStudentId(studentId)
    }
}