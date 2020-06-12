package com.borikov.day2.task2.console;

public class ArrayConsole {
    public void printReverseArray(String... arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("%s ", arr[i]);
        }
    }

    public void printIncorrectInput() {
        System.out.print("Incorrect input");
    }
}
