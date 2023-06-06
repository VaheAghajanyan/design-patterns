package com.company.Behavioral.Visitor;

public interface Item {
    double accept(ShoppingCartVisitor visitor);
}
