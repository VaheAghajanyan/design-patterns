package com.company.Behavioral.Command;

public class InsertCommand implements Command {

    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        this.database.insert();
    }
}
