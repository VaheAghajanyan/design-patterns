package com.company.Behavioral.Command;

public class DeleteCommand implements Command {

    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        this.database.delete();
    }
}
