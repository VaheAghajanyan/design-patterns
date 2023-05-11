package com.company.Creational.Builder;

public class Client {
    public static void main(String[] args) {

        Laptop laptop = new Laptop.LaptopBuilder("8GB", "256GB", "I7")
                .setGraphicsEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        System.out.println(laptop);
    }
}
