package com.borikov.day1.validator;

public class PointValidator {
    private static final int MAX_VALUE = 100;
    private static final int MIN_VALUE = -100;

    public boolean isPointInLimit(double x, double y) {
        boolean check = false;
        if ((x > MIN_VALUE && x < MAX_VALUE)
                && (y > MIN_VALUE && y < MAX_VALUE)) {
            check = true;
        }
        return check;
    }
}
