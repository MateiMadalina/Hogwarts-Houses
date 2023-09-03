package com.codecool.hogwartshouses.controller;

import com.codecool.hogwartshouses.model.Student;
import com.codecool.hogwartshouses.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(path = "/students")
public class StudentsController {
    private StudentService studentService;

    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public Set<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
}
