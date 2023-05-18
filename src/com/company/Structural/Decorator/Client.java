package com.company.Structural.Decorator;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getCost());
    }
}
