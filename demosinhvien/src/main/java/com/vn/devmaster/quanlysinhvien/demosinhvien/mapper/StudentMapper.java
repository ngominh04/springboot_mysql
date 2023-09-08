package com.vn.devmaster.quanlysinhvien.demosinhvien.mapper;

import com.vn.devmaster.quanlysinhvien.demosinhvien.domain.Student;
import com.vn.devmaster.quanlysinhvien.demosinhvien.dto.StudentDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentMapper {
    public StudentDTO toDto(Student student){
        StudentDTO studentDTO=StudentDTO.builder().frist_name(student.getFirst_name()).last_name(student.getLast_name()).id(student.getId()).build();
        return studentDTO;
    }
    public List<StudentDTO> toDTO(List<Student> students){
        List<StudentDTO> studentDTOS=new ArrayList<>();
        students.forEach(student -> {
            StudentDTO dto = toDto(student);
            studentDTOS.add(dto);
        });
        return studentDTOS;
    }

    public  Student toEntity(StudentDTO dto){
        Student student=Student.builder().id(dto.getId()).first_name(dto.getFrist_name()).last_name(dto.getLast_name()).build();
        return student;
    }

    public List<Student> toEntitys(List<StudentDTO> dtos){
        List<Student> students= new ArrayList<>();
        dtos.forEach(student -> {
            Student student1= (Student) toEntitys((List<StudentDTO>) student);
            students.add(student1);
        });
        return students;
    }
}
