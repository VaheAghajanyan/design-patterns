package com.company.Creational.Singleton.DoubleCheckedLocking;

public class Singleton {
    private volatile static Singleton singletonInstance = null;
    private int data;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            synchronized (Singleton.class) {
                if (singletonInstance == null) {
                    singletonInstance = new Singleton();
                }
            }
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
