package com.company.Structural.Facade;

class Projector {
    public void on() {
        System.out.println("Projector turned on");
    }

    public void off() {
        System.out.println("Projector turned of.");
    }

    public void setInput(DVDPlayer dvdPlayer) {
        System.out.println("Setting projector input to DVD player");
    }

    // Other Projector methods...
}
