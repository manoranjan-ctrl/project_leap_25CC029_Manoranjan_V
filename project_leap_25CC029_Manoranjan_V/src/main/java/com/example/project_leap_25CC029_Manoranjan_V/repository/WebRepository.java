package com.example.project_leap_25CC029_Manoranjan_V.repository;

import com.example.project_leap_25CC029_Manoranjan_V.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;

@Repository
public interface WebRepository extends JpaRepository<Student,Long> {

}
