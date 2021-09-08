package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student yannick = new Student("Yanick", "slashcs@gmail.com", LocalDate.of(2000, Month.JULY, 23));
            Student brinette = new Student("Brinette", "brinettelohombo7@gmail.com", LocalDate.of(1993, Month.JULY, 11));

            studentRepository.saveAll(List.of(yannick, brinette));
        };
    }

}
