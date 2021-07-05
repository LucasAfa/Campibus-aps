package com.ufpe.if718.campibus.controllers

import com.ufpe.if718.campibus.model.GeneralFacade
import com.ufpe.if718.campibus.model.entities.Student
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller("v1/student")
class StudentController(private val generalFacade: GeneralFacade) {

   // private val generalFacade = GeneralFacade.instance

    @PostMapping
    fun saveStudent(
        @RequestBody student: Student,
        model: Model
    ): String {
        val studentWithId = generalFacade.saveStudent(student)
        model.addAttribute(studentWithId)
        return "saved"
    }

    @GetMapping("{id}")
    fun getStudent(
        @PathVariable id: String,
        model: Model
    ): String {
        val student = generalFacade.getStudentById(id)
        model.addAttribute(student)
        return "ok"
    }

    @PatchMapping("{id}")
    fun updateStudent(
        @PathVariable id: String,
        @RequestBody student: Student,
        model: Model
    ): String {
        val student = generalFacade.updateStudent(id, student)
        model.addAttribute(student)
        return "updated"
    }

    @DeleteMapping("{id}")
    fun deleteStudent(
        @PathVariable id: String,
        model: Model
    ): String {
        generalFacade.deleteStudent(id)
        return "deleted"
    }

}