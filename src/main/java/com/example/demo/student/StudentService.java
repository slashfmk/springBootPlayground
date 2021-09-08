package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.*;
import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {

    public List<Student> getStudents(){

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Yanick", "slashcs@gmail.com", LocalDate.of(2000, Month.JULY, 23), 34));

        return list;
    }
}
