package com.kirshi.sqlite.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Finger
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private String classmate;
    private int age;

    public Student(String name, String classmate, int age) {
        this.name = name;
        this.classmate = classmate;
        this.age = age;
    }
}
