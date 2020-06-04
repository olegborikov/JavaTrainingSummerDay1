package com.borikov.day1.service;

import com.borikov.day1.console.TimePrint;
import com.borikov.day1.entity.DaysInMonth;
import com.borikov.day1.validation.TimeValidation;

public class TimeService {
    TimeValidation timeValidation = new TimeValidation();
    TimePrint timePrint = new TimePrint();

    // task 6
    public void getTimeBySeconds(int secondsInDay) {
        if (timeValidation.isTimeInDay(secondsInDay)) {
            int seconds = getSecondMinutes(secondsInDay);
            int minutes = getMinutesHours(secondsInDay);
            int hours = getMinutesHours(minutes);
            minutes = getSecondMinutes(minutes);
            timePrint.printTimeBySeconds(secondsInDay, hours, minutes, seconds);
        } else {
            timePrint.printIncorrectValidation();
        }
    }

    private int getMinutesHours(int time) {
        return time / 60;
    }

    private int getSecondMinutes(int time) {
        return time % 60;
    }

    // task 2
    public void getAmountOfDaysByYearAndMonth(int year, int month) {
        if (timeValidation.isYearInLimit(year)
                && timeValidation.isMonthInLimit(month)) {
            int daysInMonth = DaysInMonth.values()[month - 1].getDaysInMonth();
            if (year % 4 == 0 && month == 2) {
                daysInMonth++;
            }
            timePrint.printAmountOfDaysByYearAndMonth(
                    daysInMonth, month, year);
        } else {
            timePrint.printIncorrectValidation();
        }
    }


}
