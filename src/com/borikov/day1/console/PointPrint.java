package com.borikov.day1.console;

public class PointPrint {
    public void printIncorrectValidation() {
        System.out.println("Validation error");
    }

    public void printNearestPoint(String firstPoint, String secondPoint) {
        System.out.println("Point " + firstPoint +
                " is closer to the origin than point " + secondPoint);
    }

    public void printEqualsPoint(String firstPoint, String secondPoint) {
        System.out.println("Points " + firstPoint +
                " and " + secondPoint + " are equidistant");
    }
}
