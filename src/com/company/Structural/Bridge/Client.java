package com.company.Structural.Bridge;

public class Client {
    public static void main(String[] args) {
        Color color = new RedColor();
        Shape shape = new Triangle(color);
        System.out.println(shape.color);
    }
}
