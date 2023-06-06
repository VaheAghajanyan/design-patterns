package com.company.Behavioral.Visitor;

public interface ShoppingCartVisitor {
    double visit(Book book);
    double visit(Fruit book);
}
