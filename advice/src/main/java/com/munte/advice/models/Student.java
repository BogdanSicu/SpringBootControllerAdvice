package com.munte.advice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Student {
    public String familyName;
    public String givenName;
    public int age;

    public Student(String familyName, String givenName, int age) {
        this.familyName = familyName;
        this.givenName = givenName;
        this.age = age;
    }

    public Student() {
    }
}
