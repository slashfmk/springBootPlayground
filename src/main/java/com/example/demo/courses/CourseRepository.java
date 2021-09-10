package com.example.demo.courses;

import com.example.demo.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CourseRepository extends JpaRepository <Course, Long> {

    //@Query("SELECT c FROM Course c WHERE c.title = ?1")
    Optional<Course> findCourseByTitle(String title);
}
