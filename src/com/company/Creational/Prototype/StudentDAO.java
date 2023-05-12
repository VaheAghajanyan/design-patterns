package com.company.Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements Cloneable{
    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1, "Name"));
        studentList.add(new Student(2, "Name"));
        studentList.add(new Student(3, "Name"));
        studentList.add(new Student(4, "Name"));
    }

    public List<Student> studentList() {
        return studentList;
    }

    @Override
    public List<Student> clone() throws CloneNotSupportedException {
        List<Student> clonedStudentList = new ArrayList<>(studentList);
        return clonedStudentList;
    }
}
