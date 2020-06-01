package com.borikov.JavaTrainingSummer.task1;

public class Task1 {
    private static final String ERROR = "Incorrect input";

    // task 1
    public static void getLastNumberOfSquare(int lastNumber) {
        if (lastNumber >= 0) {
            int square = (int) Math.pow(lastNumber, 2);
            int lastNumberOfSquare = square % 10;
            System.out.println(lastNumberOfSquare);
        } else {
            System.out.println(ERROR);
        }
    }

    // task 2
    public static void getAmountOfDaysByYearAndMonth(int year, int month) {
        if (month > 0 && month < 13 && year > 0) {
            int amountOfDays = 31;
            if (month == 2)
                amountOfDays = 28;
            if (year % 4 == 0 && month == 2)
                amountOfDays = 29;
            if (month == 4 || month == 6 || month == 9 || month == 11)
                amountOfDays = 30;
            System.out.println(amountOfDays);
        } else {
            System.out.println(ERROR);
        }
    }

    // task 3
    public static void getSquareArea(double areaOfDescribedSquare) {
        double side = Math.sqrt(areaOfDescribedSquare);
        double areaOfInscribedSquare = side * side / 2;
        System.out.println("The area of inscribed square: "
                + roundToTwoNumbers(areaOfInscribedSquare));
        System.out.println("The relationship: "
                + roundToTwoNumbers(areaOfDescribedSquare / areaOfInscribedSquare));
    }

    // task 4
    public static void isTwoEvenNumbers(int a, int b, int c, int d) {
        int check = a % 2 + b % 2 + c % 2 + d % 2;
        System.out.println(check <= 2);
    }

    // task 5
    public static void isPerfectNumber(long number) {
        long sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number && number != 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    // task6
    public static void getTimeBySeconds(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            seconds %= 60;
            int hours = minutes / 60;
            minutes %= 60;

            System.out.println("Time is: " + hours + ":" + minutes + ":" + seconds);
        } else {
            System.out.println(ERROR);
        }
    }

    // task7
    public static void getNearestPoint(double x1, double y1, double x2, double y2) {
        double distance1 = lengthToOrigin(x1, y1);
        double distance2 = lengthToOrigin(x2, y2);
        if (distance2 > distance1) {
            System.out.println("A is closer to origin");
        } else {
            System.out.println("B is closer to origin");
        }
    }

    private static double lengthToOrigin(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    // task8
    public static void calculateFunction(double x) {
        double xFunction;
        if (x >= 3) {
            xFunction = getFirstStatement(x);
        } else {
            xFunction = getSecondStatement(x);
        }
        System.out.println("F(x) = " + roundToTwoNumbers(xFunction));
    }

    private static double getFirstStatement(double x) {
        return -1 * Math.pow(x, 2) + 3 * x + 9;
    }

    private static double getSecondStatement(double x) {
        return 1 / (Math.pow(x, 3) - 6);
    }

    // task 9
    public static void getLengthAndSquareOfCircle(double radius) {
        if (radius > 0) {
            double length = roundToTwoNumbers(lengthOfCircle(radius));
            double square = roundToTwoNumbers(squareOfCircle(radius));
            System.out.println("Length: " + length + "\nSquare: " + square);
        } else {
            System.out.println(ERROR);
        }
    }

    private static double lengthOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    private static double squareOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // task 10
    public static void getTableOfTangentFunction(double a, double b, double h) {
        if ((a < b && h > 0) || (a > b && h < 0)) {
            System.out.println("Table of F(x) = tg(x)");
            System.out.println("______________________");
            System.out.println("|\tX\t| F(x)=tg(x) |");
            for (double i = a; (i <= b && (a < b && h > 0))
                    || (i >= b && (a > b && h < 0)); i += h) {
                System.out.println("_________________________");
                System.out.println("|\t" + i + "\t|\t" + roundToTwoNumbers(Math.tan(i)) + "\t|");
            }
        } else {
            System.out.println(ERROR);
        }
    }

    private static double roundToTwoNumbers(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}
