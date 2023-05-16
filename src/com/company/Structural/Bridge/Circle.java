package com.company.Structural.Bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.print("Circle filled with color ");
        color.applyColor();
    }
}
