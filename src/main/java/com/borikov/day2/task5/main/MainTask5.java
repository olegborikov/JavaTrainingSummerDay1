package com.borikov.day2.task5.main;

import com.borikov.day2.task5.console.ArithmeticConsole;
import com.borikov.day2.task5.exception.InvalidDataException;
import com.borikov.day2.task5.service.ArithmeticService;

public class MainTask5 {
    public static void main(String... args) {
        ArithmeticConsole arithmeticConsole = new ArithmeticConsole();
        try {
            double[] array = new double[args.length];
            array[0] = Double.parseDouble(args[0]);
            for (int i = 1; i < args.length; i++) {
                array[i] = Double.parseDouble(args[i]);
            }
            ArithmeticService arithmeticService = new ArithmeticService();
            double multiplication = arithmeticService.getMultiplicationOfArray(array);
            double sum = arithmeticService.getSumOfArray(array);
            arithmeticConsole.printMultiplication(multiplication);
            arithmeticConsole.printSum(sum);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException
                | InvalidDataException e) {
            arithmeticConsole.printIncorrectInput();
        }
    }
}
