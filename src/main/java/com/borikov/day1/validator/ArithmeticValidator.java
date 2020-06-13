package com.borikov.day1.validator;

public class ArithmeticValidator {
    private static final int MAX_VALUE_INT = 1000;
    private static final int MIN_VALUE_INT = -1000;
    private static final long MIN_VALUE_LONG = 10000000000000L;

    public boolean isNumberPositive(double number) {
        boolean check = false;
        if (number > 0 && number < MAX_VALUE_INT) {
            check = true;
        }
        return check;
    }

    public boolean isLongNumberPositive(long number) {
        boolean check = false;
        if (number > 0 && number < MIN_VALUE_LONG) {
            check = true;
        }
        return check;
    }

    public boolean isNumberInLimit(double number) {
        boolean check = false;
        if (number > MIN_VALUE_INT && number < MAX_VALUE_INT) {
            check = true;
        }
        return check;
    }

    public boolean isNumberBetween(double a, double b, double h) {
        boolean check = false;
        if ((a < b && h > 0) || (a > b && h < 0)) {
            if (isNumberInLimit(a) && isNumberInLimit(b) && isNumberInLimit(h)) {
                check = true;
            }
        }
        return check;
    }

    public boolean isArrayInLimit(int... arr) {
        boolean check = true;
        for (int value : arr) {
            if (!isNumberInLimit(value)) {
                check = false;
                break;
            }
        }
        return check;
    }
}
