package com.ufpe.if718.campibus.core.controllers

import com.ufpe.if718.campibus.core.dto.StudentDTO
import com.ufpe.if718.campibus.core.model.GeneralFacade
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*


@Controller
@RequestMapping("/student")
class StudentController(private val generalFacade: GeneralFacade) {

    @GetMapping("/addStudentForm")
    fun addStudentForm(model: Model): String {
        val studentModel = StudentDTO().buildToDomain()
        model.addAttribute("studentModel", studentModel)
        return "addStudentForm"
    }

    @PostMapping("/saveStudent")
    fun saveStudent(
        student: StudentDTO,
        model: Model
    ): String {
        val studentWithId = generalFacade.saveStudent(student.buildToDomain())
        model.addAttribute("studentModel", studentWithId)
        return "studentSaved"
    }

    @GetMapping("/studentProfile/{id}")
    fun getStudent(
        @PathVariable id: String,
        model: Model
    ): String {
        val student = generalFacade.getStudentById(id)
        model.addAttribute("studentModel", student)
        return "studentProfile"
    }

    @GetMapping
    fun getAllStudents(
        model: Model
    ): String {
        val students = generalFacade.getAllStudents()
        model.addAttribute(students)
        return "studentList"
    }

    @PatchMapping("{id}")
    fun updateStudent(
        @PathVariable id: String,
        @RequestBody student: StudentDTO,
        model: Model
    ): String {
        val student = generalFacade.updateStudent(id, student.buildToDomain())
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