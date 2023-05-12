package com.company.Creational.Prototype;

import java.util.List;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        StudentDAO studentDAO = new StudentDAO();
        List<Student> studentCloned = studentDAO.clone();
    }
}
