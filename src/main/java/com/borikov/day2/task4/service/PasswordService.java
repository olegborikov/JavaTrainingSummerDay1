package com.borikov.day2.task4.service;

import com.borikov.day2.task4.console.PasswordConsole;

public class PasswordService {
    private static final String PASSWORD = "12345678";

    public boolean isPasswordCorrect(String inputPassword) {
        PasswordConsole passwordConsole = new PasswordConsole();
        boolean result = PASSWORD.equals(inputPassword);
        return result;
    }
}
