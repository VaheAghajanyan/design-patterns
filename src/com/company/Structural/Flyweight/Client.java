package com.company.Structural.Flyweight;

public class Client {
    public static void main(String[] args) {
        Circle circle1 = (Circle) ShapeFactory.getCircle("Red");
        circle1.setCoordinates(10, 20);
        circle1.setRadius(5);
        circle1.draw();

        Circle circle2 = (Circle) ShapeFactory.getCircle("Blue");
        circle2.setCoordinates(30, 40);
        circle2.setRadius(10);
        circle2.draw();

        Circle circle3 = (Circle) ShapeFactory.getCircle("Red");
        circle3.setCoordinates(50, 60);
        circle3.setRadius(8);
        circle3.draw();
    }
}
