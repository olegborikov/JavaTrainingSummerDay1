package com.borikov.day1.validation;

public class TimeValidation {
    private final int MAX_VALUE_SECONDS = 86400;
    private final int MAX_VALUE_MONTH = 12;
    private final int MAX_VALUE_YEAR = 5000;
    private final int MIN_VALUE = 0;

    public boolean isTimeInDay(int seconds) {
        if (seconds < MAX_VALUE_SECONDS && seconds > MIN_VALUE) {
            return true;
        }
        return false;
    }

    public boolean isYearInLimit(int year) {
        if (year < MAX_VALUE_YEAR && year > MIN_VALUE) {
            return true;
        }
        return false;
    }

    public boolean isMonthInLimit(int month) {
        if (month <= MAX_VALUE_MONTH && month > MIN_VALUE) {
            return true;
        }
        return false;
    }
}
