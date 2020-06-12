package com.borikov.day2.task3.main;

import com.borikov.day2.task3.console.ArrayConsole;
import com.borikov.day2.task3.exception.InvalidDataException;
import com.borikov.day2.task3.service.RandomService;

public class MainTask3 {
    public static void main(String... args) {
        ArrayConsole arrayConsole = new ArrayConsole();
        try {
            int numberOfElements = Integer.parseInt(args[0]);
            RandomService randomService = new RandomService();
            int[] randomArray = randomService.getRandomArray(numberOfElements);
            arrayConsole.printArrayInLine(randomArray);
            arrayConsole.printArrayInColumn(randomArray);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException
                | InvalidDataException e) {
            arrayConsole.printIncorrectInput();
        }
    }
}
