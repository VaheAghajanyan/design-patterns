package com.company.Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "movie.mp4");
        audioPlayer.play("vlc", "podcast.vlc");
        audioPlayer.play("avi", "video.avi");
    }
}
