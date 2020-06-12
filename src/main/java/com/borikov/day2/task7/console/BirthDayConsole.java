package com.borikov.day2.task7.console;

public class BirthDayConsole {
    public void printIncorrectInput() {
        System.out.print("Incorrect input");
    }

    public void printCongratulation() {
        System.out.printf("Congratulation. Today is your birthday! %n");
    }

    public void printAge(int age) {
        System.out.printf("Your age is %d %n", age);
    }

    public void printDayOfWeek(String dayOfWeek) {
        System.out.printf("You was born on %s %n", dayOfWeek);
    }
}
