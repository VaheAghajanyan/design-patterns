package com.company.Creational.Singleton.LazyEvaluation;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setData(5);
        System.out.println(singleton.getData());

        singleton = null;

        singleton = Singleton.getInstance();
        System.out.println(singleton.getData());
    }
}
