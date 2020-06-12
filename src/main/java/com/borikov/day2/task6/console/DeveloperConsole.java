package com.borikov.day2.task6.console;

import java.util.Calendar;

public class DeveloperConsole {
    public void printIncorrectInput() {
        System.out.print("Incorrect input");
    }

    public void printNameAndDays(String name, int days) {
        System.out.printf("Name: %s, task completion in: %d days %n", name, days);
    }

    public void printDeadLine(Calendar calendar) {
        System.out.printf("Dead line is: %s", calendar.getTime());
    }
}
