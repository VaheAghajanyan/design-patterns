package com.company.Structural.Composite;

public class Client {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape shape1 = new Square();
        CompositeShape compositeShape = new CompositeShape();
        compositeShape.addShape(shape);
        compositeShape.addShape(shape1);
        compositeShape.draw();
    }
}
