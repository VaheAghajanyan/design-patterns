package com.company.Structural.Facade;

class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SurroundSoundSystem soundSystem;
    private Screen screen;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector,
                             SurroundSoundSystem soundSystem, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        screen.down();
        projector.on();
        projector.setInput(dvdPlayer);
        soundSystem.on();
        soundSystem.setVolume(10);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        screen.up();
        projector.off();
        soundSystem.off();
        dvdPlayer.off();
    }
}
