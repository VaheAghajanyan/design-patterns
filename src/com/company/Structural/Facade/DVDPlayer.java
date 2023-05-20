package com.company.Structural.Facade;

class DVDPlayer {
    public void on() {
        System.out.println("DVD player turned on");
    }

    public void off() {
        System.out.println("DVD player turned off.");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    // Other DVDPlayer methods...
}
