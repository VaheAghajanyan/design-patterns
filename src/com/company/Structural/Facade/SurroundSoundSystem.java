package com.company.Structural.Facade;

class SurroundSoundSystem {
    public void on() {
        System.out.println("Surround sound system turned on");
    }

    public void off() {
        System.out.println("Surround sound system turned off.");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to: " + volume);
    }

    // Other SurroundSoundSystem methods...
}
