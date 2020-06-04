package com.borikov.day1.main;

import com.borikov.day1.service.TimeService;

public class TimeMain {
    public static void main(String[] args) {
        TimeService timeService = new TimeService();

//      task 2 testing
        int year = 2015;
        int month = 2;
        timeService.getAmountOfDaysByYearAndMonth(year, month);

//      task 6 testing
        int seconds = 1000;
        timeService.getTimeBySeconds(seconds);
    }
}
