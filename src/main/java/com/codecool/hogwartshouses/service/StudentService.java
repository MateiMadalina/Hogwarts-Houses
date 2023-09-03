package com.codecool.hogwartshouses.service;

import com.codecool.hogwartshouses.model.Student;
import com.codecool.hogwartshouses.service.DAO.StudentDAO;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StudentService {
    private StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }


    public Set<Student> getStudents() {
        return studentDAO.getStudents();
    }

    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }
}
