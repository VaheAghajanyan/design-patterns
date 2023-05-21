package com.company.Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

class ShapeFactory {
    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getCircle(String color) {
        // Check if a circle with the given color already exists
        Shape circle = shapeMap.get(color);

        if (circle == null) {
            // If the circle doesn't exist, create a new one and add it to the map
            circle = new Circle(color);
            shapeMap.put(color, circle);
        }

        return circle;
    }
}
