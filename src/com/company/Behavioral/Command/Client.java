package com.company.Behavioral.Command;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

    }
}
