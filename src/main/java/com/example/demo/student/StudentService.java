package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());

        if (studentByEmail.isPresent()) {
            throw new IllegalStateException("Email taken");
        }

        this.studentRepository.save(student);
    }

    public void deleteStudent(long id) {
        boolean studentExists = studentRepository.existsById(id);

        if (!studentExists) {
            throw new IllegalStateException("Cannot delete a student that doesn't exist");
        }
        this.studentRepository.deleteById(id);
    }
}
