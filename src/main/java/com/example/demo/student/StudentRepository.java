package com.example.demo.student;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;


@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {

//    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
  //  Optional<Student> findStudentsByDob(LocalDate dob);

//    @Query("DELETE  FROM Student s WHERE s.id = ?1")
//    Optional<Student> deleteById(String email);
}
