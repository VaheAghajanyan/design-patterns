package com.company.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a group of shapes:");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
