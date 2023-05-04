package com.company.Creational.AbstractFactory;

public abstract class AbstractFactory {
    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
}
