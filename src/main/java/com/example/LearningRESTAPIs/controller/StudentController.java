package com.example.LearningRESTAPIs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LearningRESTAPIs.dto.StudentDto;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent() {
        return new StudentDto(12, "Suchi", "suchi@gmail.com");
    }
}
