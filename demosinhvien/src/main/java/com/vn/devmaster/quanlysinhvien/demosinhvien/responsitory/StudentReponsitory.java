package com.vn.devmaster.quanlysinhvien.demosinhvien.responsitory;

import com.vn.devmaster.quanlysinhvien.demosinhvien.domain.Student;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentReponsitory extends JpaRepository<Student, Integer> {
    List<Student> findAll();
}
