package com.borikov.day1.service;

import com.borikov.day1.exception.IncorrectDataException;
import com.borikov.day1.validator.ArithmeticValidator;

import static java.lang.Math.*;

public class NumberService {

    // task 1
    public int getLastNumberOfSquare(int number) throws IncorrectDataException {
        ArithmeticValidator arithmeticValidator = new ArithmeticValidator();
        if (arithmeticValidator.isNumberInLimit(number)) {
            throw new IncorrectDataException();
        }
        int lastNumber = getLastNumber(number);
        int square = (int) pow(lastNumber, 2);
        int lastNumberOfSquare = getLastNumber(square);
        return lastNumberOfSquare;
    }

    private int getLastNumber(int number) {
        return number % 10;
    }

    // task 4
    public boolean isTwoNumbersEven(int... arr) throws IncorrectDataException {
        ArithmeticValidator arithmeticValidator = new ArithmeticValidator();
        if (arithmeticValidator.isArrayInLimit(arr) && arr.length >= 4) {
            throw new IncorrectDataException();
        }
        int result = 0;
        for (int value : arr) {
            result += isNumberEven(value);
        }
        return result >= 2;
    }

    private int isNumberEven(int number) {
        return number % 2;
    }

    // task 5
    public boolean isNumberPerfect(int number) throws IncorrectDataException {
        ArithmeticValidator arithmeticValidator = new ArithmeticValidator();
        if (arithmeticValidator.isLongNumberPositive(number)) {
            throw new IncorrectDataException();
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number && number != 0;
    }
}
