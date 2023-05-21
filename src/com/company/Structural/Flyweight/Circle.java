package com.company.Structural.Flyweight;

class Circle implements Shape {
    private final String color;  // Intrinsic state
    private int x;               // Extrinsic state
    private int y;               // Extrinsic state
    private int radius;          // Extrinsic state

    public Circle(String color) {
        this.color = color;
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with color: " + color + ", x: " + x + ", y: " + y + ", radius: " + radius);
    }
}
