package com.borikov.day1.service;

import com.borikov.day1.console.NumberPrint;
import com.borikov.day1.validation.ArithmeticValidation;

public class NumberService {
    NumberPrint numberPrint = new NumberPrint();
    ArithmeticValidation arithmeticValidation = new ArithmeticValidation();

    // task 1
    public void getLastNumberOfSquare(int number) {
        if (arithmeticValidation.isNumberInLimit(number)) {
            int lastNumber = getLastNumber(number);
            int square = (int) Math.pow(lastNumber, 2);
            int lastNumberOfSquare = getLastNumber(square);
            numberPrint.printLastNumberOfSquare(lastNumberOfSquare, number);
        } else {
            numberPrint.printIncorrectValidation();
        }
    }

    private int getLastNumber(int number) {
        return number % 10;
    }

    // task 4
    public void isTwoEvenNumbers(int a, int b, int c, int d) {
        if (arithmeticValidation.isNumberInLimit(a)
                && arithmeticValidation.isNumberInLimit(b)
                && arithmeticValidation.isNumberInLimit(c)
                && arithmeticValidation.isNumberInLimit(d)) {
            int check = isNumberEven(a) + isNumberEven(b) +
                    isNumberEven(c) + isNumberEven(d);
            numberPrint.printIsTwoEvenNumbers(a, b, c, d, check >= 2);
        } else {
            numberPrint.printIncorrectValidation();
        }
    }

    private int isNumberEven(int number) {
        return number % 2;
    }

    // task 5
    public void isPerfectNumber(int number) {
        if (arithmeticValidation.isNumberPositive(number)) {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            numberPrint.printIsPerfectNumber(number,
                    sum == number && number != 0);
        } else {
            numberPrint.printIncorrectValidation();
        }
    }
}
