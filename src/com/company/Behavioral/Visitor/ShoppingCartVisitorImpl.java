package com.company.Behavioral.Visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public double visit(Book book) {
        double cost = 0.0;

        if (book.getPrice() > 500) {
            cost = book.getPrice() - 100;
        } else {
            cost = book.getPrice();
        }
        System.out.println("Book: " + book.getName() + " Book ISBN: " + book.getIsbnNumber() + " Cost: " + cost);
        return cost;
    }

    @Override
    public double visit(Fruit fruit) {
        double cost = fruit.getPrice() * fruit.getWeight();
        System.out.println("Fruit: " + fruit.getName() + " cost: " + fruit.getPrice());
        return cost;
    }
}
