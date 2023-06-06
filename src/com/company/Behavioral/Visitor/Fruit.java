package com.company.Behavioral.Visitor;

public class Fruit implements Item {
    private String name;
    private int weight;
    private double price;

    public Fruit(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept (ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
