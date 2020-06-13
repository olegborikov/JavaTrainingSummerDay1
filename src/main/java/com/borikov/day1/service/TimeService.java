package com.borikov.day1.service;

import com.borikov.day1.entity.Month;
import com.borikov.day1.exception.IncorrectDataException;
import com.borikov.day1.validator.TimeValidator;

public class TimeService {

    private static final int SECONDS_IN_HOUR = 3600;
    private static final int MINUTES_IN_HOUR = 60;

    // task 2
    public int getDaysByYearAndMonth(int year, int month) throws IncorrectDataException {
        TimeValidator timeValidator = new TimeValidator();
        if (!(timeValidator.isYearInLimit(year) && timeValidator.isMonthInLimit(month))) {
            throw new IncorrectDataException();
        }

        int daysInMonth = Month.values()[month - 1].getDaysInMonth();
        if (isYearLeapAndMonthFebruary(year, month)) {
            daysInMonth++;
        }
        return daysInMonth;
    }

    private boolean isYearLeapAndMonthFebruary(int year, int month) {
        boolean check = false;
        if (year % 4 == 0 && month == 2) {
            check = true;
        }
        return check;
    }

    // task 6
    public String getTimeBySeconds(int secondsInDay) throws IncorrectDataException {
        TimeValidator timeValidator = new TimeValidator();
        if (!timeValidator.isSecondsInLimit(secondsInDay)) {
            throw new IncorrectDataException();
        }
        int hours = secondsInDay / SECONDS_IN_HOUR;
        secondsInDay -= hours * SECONDS_IN_HOUR;
        int minutes = secondsInDay / MINUTES_IN_HOUR;
        int seconds = secondsInDay - minutes * MINUTES_IN_HOUR;
        return hours + ":" + minutes + ":" + seconds;
    }
}
