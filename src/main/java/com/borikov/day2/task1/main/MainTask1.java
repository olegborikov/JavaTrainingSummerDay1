package com.borikov.day2.task1.main;

import com.borikov.day2.task1.console.HelloConsole;

public class MainTask1 {
    public static void main(String... args) {
        HelloConsole helloConsole = new HelloConsole();
        if (args.length > 0) {
            String name = args[0];
            helloConsole.printHello(name);
        } else {
            helloConsole.printIncorrectInput();
        }
    }
}
