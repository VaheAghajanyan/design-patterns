package com.company.Structural.Decorator;

class TomatoDecorator extends PizzaDecorator {
    public TomatoDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with tomatoes";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }
}
