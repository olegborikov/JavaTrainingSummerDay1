package com.borikov.day2.task4.main;

import com.borikov.day2.task4.console.PasswordConsole;
import com.borikov.day2.task4.service.PasswordService;

public class MainTask4 {
    public static void main(String... args) {
        PasswordConsole passwordConsole = new PasswordConsole();
        try {
            String inputPassword = args[0];
            PasswordService passwordService = new PasswordService();
            boolean result = passwordService.isPasswordCorrect(inputPassword);
            passwordConsole.printPasswordEquals(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            passwordConsole.printIncorrectInput();
        }
    }
}
