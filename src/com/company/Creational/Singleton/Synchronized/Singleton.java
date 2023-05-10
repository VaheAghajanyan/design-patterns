package com.company.Creational.Singleton.Synchronized;

public class Singleton {
    private static Singleton singletonInstance = null;
    private int data;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }
}
