package com.projects.studentmanagementsystem.service.impl;

import com.projects.studentmanagementsystem.entity.Student;
import com.projects.studentmanagementsystem.repository.StudentRepository;
import com.projects.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
       return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student deleteById(Long id) {
        Student student=studentRepository.getById(id);
        studentRepository.deleteById(id);
        return student;
    }
}
