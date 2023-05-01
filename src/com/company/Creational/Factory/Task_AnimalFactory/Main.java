package com.company.Creational.Factory.Task_AnimalFactory;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = AnimalFactory.getAnimal("LION");
        animal1.walk();

        Animal animal2 = AnimalFactory.getAnimal("TIGER");
        animal2.walk();
    }
}
