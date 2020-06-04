package com.borikov.day1.validation;

public class ArithmeticValidation {
    private final int MAX_VALUE = 1000;
    private final int MIN_VALUE = -1000;

    public boolean isNumberPositive(double number) {
        if (number > 0 && number < MAX_VALUE) {
            return true;
        }
        return false;
    }

    public boolean isNumberInLimit(double number) {
        if (number > MIN_VALUE && number < MAX_VALUE) {
            return true;
        }
        return false;
    }

    public boolean isNumberBetween(double a, double b, double h) {
        if ((a < b && h > 0) || (a > b && h < 0)) {
            if (isNumberInLimit(a) && isNumberInLimit(b) && isNumberInLimit(h)) {
                return true;
            }
        }
        return false;
    }
}
