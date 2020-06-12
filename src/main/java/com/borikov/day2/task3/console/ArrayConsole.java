package com.borikov.day2.task3.console;

public class ArrayConsole {
    public void printArrayInLine(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public void printArrayInColumn(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%n%d", arr[i]);
        }
    }

    public void printIncorrectInput(int... arr) {
        System.out.print("Incorrect input");
    }
}
