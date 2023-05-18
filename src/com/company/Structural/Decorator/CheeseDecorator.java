package com.company.Structural.Decorator;

class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with extra cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}