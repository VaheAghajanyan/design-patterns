package com.company.Behavioral.Interpreter;

public class InterpreterEngine {
    public int addition(String inputData) {
        String[] tokens = interpret(inputData);
        int number1 = Integer.parseInt(tokens[0]);
        int number2 = Integer.parseInt(tokens[1]);
        return number1 + number2;
    }

    public int subtraction(String inputData) {
        String[] tokens = interpret(inputData);
        int number1 = Integer.parseInt(tokens[0]);
        int number2 = Integer.parseInt(tokens[1]);
        return number2 - number1;
    }

    private String[] interpret(String inputData) {
        String tempInputData = inputData.replaceAll("[^0-9]", " ");
        tempInputData = tempInputData.replaceAll("()+", " ").trim();
        String[] inputDatatokens = tempInputData.split(" ");
        return inputDatatokens;
    }
}
