package com.borikov.day1.console;

public class NumberPrint {
    public void printIncorrectValidation() {
        System.out.println("Validation error");
    }

    public void printLastNumberOfSquare(int lastNumberOfSquare, int number) {
        System.out.println("The last number of the square of "
                + number + " is " + lastNumberOfSquare);
    }

    public void printIsTwoEvenNumbers(int a, int b, int c, int d, boolean check) {
        System.out.println("Between numbers " + a + ", " + b + ", " + c +
                ", " + d + " there is at least two even numbers: " + check);
    }

    public void printIsPerfectNumber(int number, boolean check) {
        System.out.println("Number " + number
                + " is perfect number: " + check);
    }
}
