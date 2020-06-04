package com.borikov.day1.console;

public class ShapePrint {
    public void printIncorrectValidation() {
        System.out.println("Validation error");
    }

    public void printLengthAndSquareOfCircle(double radius,
                                             double length, double square) {
        System.out.printf("Circle with radius %.2f" +
                " has length %.2f and square %.2f %n", radius, length, square);
    }

    public void printSquareArea(double areaOfInscribedSquare,
                                double areaOfDescribedSquare) {
        System.out.printf("The area of inscribed square is %.2f %n",
                areaOfInscribedSquare);
        System.out.printf("The relationship is %.2f %n",
                areaOfDescribedSquare / areaOfInscribedSquare);
    }
}
