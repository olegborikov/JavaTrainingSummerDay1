package com.borikov.day1.validator;

public class TimeValidator {
    private static final int MAX_VALUE_SECONDS = 86400;
    private static final int MAX_VALUE_MONTH = 12;
    private static final int MAX_VALUE_YEAR = 5000;
    private static final int MIN_VALUE = 0;

    public boolean isSecondsInLimit(int seconds) {
        boolean check = false;
        if (seconds < MAX_VALUE_SECONDS && seconds > MIN_VALUE) {
            check = true;
        }
        return check;
    }

    public boolean isYearInLimit(int year) {
        boolean check = false;
        if (year < MAX_VALUE_YEAR && year > MIN_VALUE) {
            check = true;
        }
        return check;
    }

    public boolean isMonthInLimit(int month) {
        boolean check = false;
        if (month <= MAX_VALUE_MONTH && month > MIN_VALUE) {
            check = true;
        }
        return check;
    }
}
