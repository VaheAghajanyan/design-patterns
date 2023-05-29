package com.company.Behavioral.Iterator;

public class Client {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Docker"};
        var dev = new JavaDeveloper("Vahe", skills);
        var iterator = dev.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
