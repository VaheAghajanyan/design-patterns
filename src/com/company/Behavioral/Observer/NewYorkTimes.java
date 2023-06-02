package com.company.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewYorkTimes implements Subject{
    private List<Observer> list = new ArrayList<>();

    public NewYorkTimes() {
    }

    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyClients(String notification) {
        this.list
                .forEach(observer -> observer.update(notification));
    }
}
