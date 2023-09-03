package com.codecool.hogwartshouses.service.DAO;

import com.codecool.hogwartshouses.model.Student;

import java.util.Set;

public interface StudentDAO {
    Set<Student> getStudents();
    void addStudent(Student student);
}
