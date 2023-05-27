package com.company.Behavioral.Interpreter;

public class Client {
    public static void main(String[] args) {
        InterpreterEngine interpreterEngine = new InterpreterEngine();
        InterpreterClient interpreterClient = new InterpreterClient(interpreterEngine);

        System.out.println("Addition of both Number is = " + interpreterClient.interpret("add 200 and 75"));
        System.out.println("------------------------------------------");
        System.out.println("Subtraction of number is = " + interpreterClient.interpret("subtract 30 from 100"));
    }
}
