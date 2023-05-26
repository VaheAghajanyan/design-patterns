package com.company.Behavioral.Command;

public class UpdateCommand implements Command {

    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        this.database.update();
    }
}
