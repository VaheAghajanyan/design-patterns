package com.company.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        this.users.stream()
                .filter(u -> u != user)
                .forEach(u -> u.getMessage(message));

        admin.getMessage(message);
    }
}
