package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
//Dependensy Injection
@Service
public class StudentService {
    //quyidagi methodimiz massif tipidagi malumot qaytaradi
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Xusniddin",
                        "xxusanboyev323@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,5),
                        22
                )
        );
    }
}
