package org.example.entity;

import lombok.Data;

@Data
public class Student {
    int sid;
    final String name;
    final String sex;
    final int grade;
}
