package com.example.project_leap_25CC029_Manoranjan_V.controller;

import com.example.project_leap_25CC029_Manoranjan_V.services.WebService;
import com.example.project_leap_25CC029_Manoranjan_V.services.impl.WebServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    WebService webService;

    @PostMapping("/data/write")
    String writeData(String data){
        return webService.writeData(data);
    }
    @GetMapping("/data/read")
    String readData(){
        return webService.readData();
    }
}
