package com.company.Creational.AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        } else if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
