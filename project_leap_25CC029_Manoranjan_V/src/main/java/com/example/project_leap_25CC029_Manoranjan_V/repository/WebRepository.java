package com.example.project_leap_25CC029_Manoranjan_V.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface WebRepository   {
    String writeData(String data);
    String readData();
}
