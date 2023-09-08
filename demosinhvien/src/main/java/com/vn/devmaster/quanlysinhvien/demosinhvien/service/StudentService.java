package com.vn.devmaster.quanlysinhvien.demosinhvien.service;

import com.vn.devmaster.quanlysinhvien.demosinhvien.domain.Student;
import com.vn.devmaster.quanlysinhvien.demosinhvien.dto.StudentDTO;
import com.vn.devmaster.quanlysinhvien.demosinhvien.mapper.StudentMapper;
import com.vn.devmaster.quanlysinhvien.demosinhvien.responsitory.StudentReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentReponsitory studentReponsitory;

    @Autowired
    private StudentMapper studentMapper;
    public List<Student> getAll(){
        List<Student> students=studentReponsitory.findAll();
        return students;
    }

    public void save(StudentDTO studentDTO){
        Student student = studentMapper.toEntity(studentDTO);
        studentReponsitory.save(student);
    }

    public void saves(List<StudentDTO> dtos) {
        List<Student> students=studentMapper.toEntitys(dtos);
        studentReponsitory.saveAll(students);
    }
}
