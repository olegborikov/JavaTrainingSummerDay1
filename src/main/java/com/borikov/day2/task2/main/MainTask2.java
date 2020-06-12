package com.borikov.day2.task2.main;

import com.borikov.day2.task2.console.ArrayConsole;

public class MainTask2 {
    public static void main(String... args) {
        ArrayConsole arrayConsole = new ArrayConsole();
        if (args.length > 0) {
            arrayConsole.printReverseArray(args);
        } else {
            arrayConsole.printIncorrectInput();
        }
    }
}
