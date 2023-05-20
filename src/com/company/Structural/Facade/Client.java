package com.company.Structural.Facade;

public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(
                new DVDPlayer(),
                new Projector(),
                new SurroundSoundSystem(),
                new Screen());

        homeTheaterFacade.watchMovie("Harry Potter");
        homeTheaterFacade.endMovie();
    }
}
