package com.borikov.day1.validation;

public class PointValidation {
    private final int MAX_VALUE = 100;
    private final int MIN_VALUE = -100;

    public boolean isPointInLimit(double x, double y) {
        if ((x > MIN_VALUE && x < MAX_VALUE)
                && (y > MIN_VALUE && y < MAX_VALUE)) {
            return true;
        }
        return false;
    }
}
