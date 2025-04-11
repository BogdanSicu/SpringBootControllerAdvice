package com.munte.advice.controllers;

import com.munte.advice.exceptions.StudentException;
import com.munte.advice.models.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final List<Student> listOfStudents = Arrays.asList(
            new Student("Papuc", "Alex1", 20),
            new Student("Ciubota", "Alex2", 20),
            new Student("Vacaru", "Alex3", 20)
    );

    @GetMapping()
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(listOfStudents);
    }

    @GetMapping("/error")
    public ResponseEntity<List<Student>> throwError() {

        throw new StudentException("test error");

    }
}
