package com.company;

public class Doctor extends Human {
    private int experience;
    public Doctor(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }
}
