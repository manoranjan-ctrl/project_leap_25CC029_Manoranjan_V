package com.example.project_leap_25CC029_Manoranjan_V.controller;

import com.example.project_leap_25CC029_Manoranjan_V.model.Student;
import com.example.project_leap_25CC029_Manoranjan_V.services.WebService;
import com.example.project_leap_25CC029_Manoranjan_V.services.impl.WebServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController {
    @Autowired
    WebService webService;
    @DeleteMapping("/delete")
    public String delete(@RequestParam("id") Long id) {
        webService.deleteStudent(id);
        return "Deleted Student " + id + " Successfully";
    }

    @GetMapping("/Details")
    List<Student> studentDetails(){
        return webService.readStudents();
    }

    @PostMapping("/Add")
    Student addStudent(@RequestBody Student student){
        return webService.saveStudent(student);
    }

    @PostMapping("/update")
    Student updateStudent(@RequestBody Student student){
      return  webService.updateStudent(student);
    }



}
