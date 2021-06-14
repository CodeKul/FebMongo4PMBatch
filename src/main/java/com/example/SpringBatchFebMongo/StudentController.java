package com.example.SpringBatchFebMongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentRepo studentRepo;

    @PostMapping(value = "saveStud")
    public String saveStud(@RequestBody Student student) {
        studentRepo.save(student);
        return "Saved";
    }

    @GetMapping(value = "getStud")
    public List<Student> getStudent(){
        return studentRepo.findAll();
    }
}
