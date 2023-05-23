package com.company.Structural.proxy;

public class Client {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        image1.display(); // Image will be loaded and displayed

        Image image2 = new ProxyImage("image2.jpg");
        // Image is not loaded yet

        image2.display(); // Image will be loaded and displayed
    }
}
