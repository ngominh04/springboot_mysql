package com.vn.devmaster.quanlysinhvien.demosinhvien.controller;

import com.vn.devmaster.quanlysinhvien.demosinhvien.domain.Student;
import com.vn.devmaster.quanlysinhvien.demosinhvien.dto.StudentDTO;
import com.vn.devmaster.quanlysinhvien.demosinhvien.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    List<Student> getAll(){
        return studentService.getAll();
    }
    @PostMapping("/student")
    String save(@RequestBody StudentDTO student){
        studentService.save(student);
        return "ok";
    }

    @PostMapping("/students")
    String saves(@RequestBody List<StudentDTO> dtos){
        studentService.saves(dtos);
        return "okk";
    }


}
