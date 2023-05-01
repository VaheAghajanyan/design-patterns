package com.company.Creational.Factory.Task_AnimalFactory;

public class AnimalFactory {
    public static Animal getAnimal(String animalType) {
        if (animalType == null) {
            return null;
        } else if (animalType.equalsIgnoreCase("LION")) {
            return new Lion();
        } else if (animalType.equalsIgnoreCase("TIGER")) {
            return new Tiger();
        }

        return null;
    }
}
