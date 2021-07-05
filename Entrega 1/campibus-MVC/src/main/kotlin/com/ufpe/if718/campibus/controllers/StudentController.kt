package com.ufpe.if718.campibus.controllers

import com.ufpe.if718.campibus.dto.StudentDTO
import com.ufpe.if718.campibus.model.GeneralFacade
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class StudentController(private val generalFacade: GeneralFacade) {

    @PostMapping("/student")
    fun saveStudent(
        @RequestBody student: StudentDTO,
        model: Model
    ): String {
        val studentWithId = generalFacade.saveStudent(student.buildToDomain())
        model.addAttribute(studentWithId)
        return "saved"
    }

    @GetMapping("/student/{id}")
    fun getStudent(
        @PathVariable id: String,
        model: Model
    ): String {
        val student = generalFacade.getStudentById(id)
        model.addAttribute(student)
        return "ok"
    }

    @GetMapping("/student")
    fun getAllStudents(
        model: Model
    ): String {
        val students = generalFacade.getAllStudents()
        model.addAttribute(students)
        return "studentList"
    }

    @PatchMapping("student/{id}")
    fun updateStudent(
        @PathVariable id: String,
        @RequestBody student: StudentDTO,
        model: Model
    ): String {
        val student = generalFacade.updateStudent(id, student.buildToDomain())
        model.addAttribute(student)
        return "updated"
    }

    @DeleteMapping("/student/{id}")
    fun deleteStudent(
        @PathVariable id: String,
        model: Model
    ): String {
        generalFacade.deleteStudent(id)
        return "deleted"
    }

}