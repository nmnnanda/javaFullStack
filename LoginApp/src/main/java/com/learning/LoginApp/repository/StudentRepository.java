package com.learning.LoginApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.LoginApp.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
  Student findByEmail(String email);
}
