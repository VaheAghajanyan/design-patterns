package com.company.Behavioral.Command;

public class SelectCommand implements Command {

    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        this.database.select();
    }
}
