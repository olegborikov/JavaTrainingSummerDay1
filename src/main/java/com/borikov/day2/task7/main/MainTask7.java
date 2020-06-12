package com.borikov.day2.task7.main;

import com.borikov.day2.task7.console.BirthDayConsole;
import com.borikov.day2.task7.exception.InvalidDataException;
import com.borikov.day2.task7.service.BirthDayService;

import java.util.Calendar;

public class MainTask7 {
    public static void main(String... args) {
        BirthDayConsole birthDayConsole = new BirthDayConsole();
        try {
            int dayOfBirthDay = Integer.parseInt(args[0]);
            int monthOfBirthDay = Integer.parseInt(args[1]);
            int yearOfBirthDay = Integer.parseInt(args[2]);
            BirthDayService birthDayService = new BirthDayService();
            Calendar birthDay = birthDayService.convertToData(dayOfBirthDay,
                    monthOfBirthDay, yearOfBirthDay);
            int age = birthDayService.getAge(birthDay);
            String dayOfWeek = birthDayService.getDayOfWeek(birthDay);
            if (birthDayService.isBirthDayToday(birthDay)) {
                birthDayConsole.printCongratulation();
            }
            birthDayConsole.printAge(age);
            birthDayConsole.printDayOfWeek(dayOfWeek);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException
                | InvalidDataException e) {
            birthDayConsole.printIncorrectInput();
        }
    }
}
