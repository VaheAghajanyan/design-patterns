package com.company.Behavioral.Observer;

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String notification) {
        System.out.println("User " + this.name + ": Received notification - " + notification);
    }
}
