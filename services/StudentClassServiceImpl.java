package com.ttn.demo.core.services;

import com.ttn.demo.core.models.Student;
import org.osgi.service.component.annotations.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component(service = StudentClassService.class)
public class StudentClassServiceImpl implements StudentClassService {
    private final List<Student> studentList = new ArrayList<>();

    public StudentClassServiceImpl() {
        studentList.add(new Student(1, "aman", 97,22));
        studentList.add(new Student(2, "naman", 25, 28));
        studentList.add(new Student(3, "raman", 50, 19));
    }

    @Override
    public String addStudent(Student student) {
        studentList.add(student);
        return "Student added successfully: " + student.getName();
    }

    @Override
    public String deleteStudent(int id) {
        Optional<Student> studentToRemove = studentList.stream().filter(s -> s.getId() == id).findFirst();
        if (studentToRemove.isPresent()) {
            studentList.remove(studentToRemove.get());
            return "Student removed successfully";
        }
        return "Student not found";
    }

    @Override
    public boolean isStudentPassed(int id) {
        return studentList.stream().anyMatch(s -> s.getId() == id && s.getMarks() >= 40);
    }

    @Override
    public Student getStudent(int id) {
        return studentList.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }
}