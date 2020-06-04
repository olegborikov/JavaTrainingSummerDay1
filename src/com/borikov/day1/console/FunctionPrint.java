package com.borikov.day1.console;

public class FunctionPrint {
    public void printIncorrectValidation() {
        System.out.println("Validation error");
    }

    public void printCalculateFunction(double result) {
        System.out.printf("Result of function is: %.2f", result);
    }

    public void printHeadTableOfTangentFunction() {
        System.out.println("Table of F(x) = tg(x)");
        System.out.println("______________________");
        System.out.println("|\t X \t| F(x)=tg(x) |");
    }

    public void printBodyTableOfTangentFunction(double i, double tan) {
        System.out.println("_________________________");
        System.out.printf("|\t %.2f \t|\t %.2f \t| %n", i, tan);
    }
}

