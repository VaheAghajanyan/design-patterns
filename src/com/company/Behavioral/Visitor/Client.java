package com.company.Behavioral.Visitor;

public class Client {
    public static void main(String[] args) {
        Item[] items = new Item[] {
                new Book("Book1", "1234", 600),
                new Book("Book2", "12345", 400),
                new Fruit("Bananas", 2, 500),
                new Fruit("Oranges", 3, 300)
        };

        double totalCost = calculateTotalCost(items);
    }

    private static double calculateTotalCost(Item[] items) {
        ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImpl();

        double totalCost = 0.0;

        for (Item i : items) {
            totalCost += i.accept(shoppingCartVisitor);
        }
        return totalCost;
    }
}
