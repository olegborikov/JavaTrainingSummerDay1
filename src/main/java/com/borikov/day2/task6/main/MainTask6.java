package com.borikov.day2.task6.main;

import com.borikov.day2.task6.console.DeveloperConsole;
import com.borikov.day2.task6.exception.InvalidDataException;
import com.borikov.day2.task6.service.DeveloperService;

import java.util.Calendar;

public class MainTask6 {
    public static void main(String... args) {
        DeveloperConsole developerConsole = new DeveloperConsole();
        try {
            String name;
            int amountOfDays;
            name = args[0];
            amountOfDays = Integer.parseInt(args[1]);
            DeveloperService developerService = new DeveloperService();
            Calendar deadLine = developerService.getDeadLine(name, amountOfDays);
            developerConsole.printNameAndDays(name, amountOfDays);
            developerConsole.printDeadLine(deadLine);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException
                | InvalidDataException e) {
            developerConsole.printIncorrectInput();
        }
    }
}
