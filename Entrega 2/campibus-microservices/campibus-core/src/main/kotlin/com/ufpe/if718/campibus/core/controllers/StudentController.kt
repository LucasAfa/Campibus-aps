package com.ufpe.if718.campibus.core.controllers

import com.ufpe.if718.campibus.core.dto.StudentDTO
import com.ufpe.if718.campibus.core.model.GeneralFacade
import com.ufpe.if718.campibus.core.model.entities.Student
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/students")
class StudentController(private val generalFacade: GeneralFacade) {

    @PostMapping
    fun saveStudent(
        @RequestBody student: StudentDTO
    ): Student {
        return generalFacade.saveStudent(student.buildToDomain())
    }

    @GetMapping("{id}")
    fun getStudent(
        @PathVariable id: String
    ): Student {
        return generalFacade.getStudentById(id)
    }

    @GetMapping
    fun getAllStudents(): List<Student> {
        return generalFacade.getAllStudents()
    }

    @PutMapping("{id}")
    fun updateStudent(
        @PathVariable id: String,
        @RequestBody student: StudentDTO
    ): Student {
        return generalFacade.updateStudent(id, student.buildToDomain())
    }

    @DeleteMapping("{id}")
    fun deleteStudent(
        @PathVariable id: String
    ) {
        generalFacade.deleteStudent(id)
    }

}