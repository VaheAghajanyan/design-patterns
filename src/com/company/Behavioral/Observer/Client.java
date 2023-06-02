package com.company.Behavioral.Observer;

public class Client {
    public static void main(String[] args) {
        NewYorkTimes newYorkTimes = new NewYorkTimes();
        User Vahe = new User("Vahe");
        newYorkTimes.register(Vahe);

        newYorkTimes.notifyClients("New magazine !!!");
    }
}
