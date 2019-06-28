package com.thien.CassandraApp.Controller;

import com.thien.CassandraApp.Repository.StudentRepository;
import com.thien.CassandraApp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/create")
    public void createStudent(@RequestBody Student student) {

        studentRepository.save(student);
    }

//    @PostConstruct
//    public void saveUser() {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(10, "An", "RIchmond", 3));
//        students.add(new Student(20, "Jen", "Richmnd", 6));
//
//        studentRepository.saveAll(students);
//    }

    @GetMapping("/all")
    public List<Student> get() {
        return studentRepository.findAll();
    }

    @GetMapping("/getStudentFilterByAge/{age}")
    public List<Student> getStudentByAge(@PathVariable Integer age) {
        return studentRepository.findByAgeGreaterThan(age);
    }
}
