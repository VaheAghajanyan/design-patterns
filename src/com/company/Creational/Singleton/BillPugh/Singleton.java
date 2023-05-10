package com.company.Creational.Singleton.BillPugh;

public class Singleton {
    private int data;
    private static class SingletonHelper {
        private static final Singleton uniqueInstance = new Singleton();
    }

    private Singleton () {};

    private void setData(int data) {
        this.data = data;
    }

    private int getData() {
        return this.data;
    }
}
