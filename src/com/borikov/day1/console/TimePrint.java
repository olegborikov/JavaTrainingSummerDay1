package com.borikov.day1.console;

public class TimePrint {
    public void printIncorrectValidation() {
        System.out.println("Validation error");
    }

    public void printTimeBySeconds(int secondsInDay, int hours,
                                   int minutes, int seconds) {
        System.out.println("If left " + secondsInDay + " seconds " +
                "time is: " + hours + ":" + minutes + ":" + seconds);
    }

    public void printAmountOfDaysByYearAndMonth(int daysInMonth,
                                                int month, int year) {
        System.out.println("On " + month + "." + year +
                " there is " + daysInMonth + " days");
    }
}
