package com.company.Structural.proxy;

class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image: " + filename);
        // Perform actual image loading from disk
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
        // Render the image on the screen
    }
}
