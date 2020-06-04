package com.borikov.day1.service;

import com.borikov.day1.console.ShapePrint;
import com.borikov.day1.validation.ArithmeticValidation;

public class ShapeService {
    ShapePrint shapePrint = new ShapePrint();
    ArithmeticValidation arithmeticValidation = new ArithmeticValidation();

    // task 3

    public void getAreaOfInscribedSquareByAreaOfDescribedSquare(
            double areaOfDescribedSquare) {
        if (arithmeticValidation.isNumberPositive(areaOfDescribedSquare)) {
            double side = Math.sqrt(areaOfDescribedSquare);
            double areaOfInscribedSquare = side * side / 2;
            shapePrint.printSquareArea(areaOfInscribedSquare, areaOfDescribedSquare);
        } else {
            shapePrint.printIncorrectValidation();
        }
    }

    // task 9
    public void getLengthAndSquareOfCircle(double radius) {
        if (arithmeticValidation.isNumberPositive(radius)) {
            double length = lengthOfCircle(radius);
            double square = squareOfCircle(radius);
            shapePrint.printLengthAndSquareOfCircle(radius, length, square);
        } else {
            shapePrint.printIncorrectValidation();
        }
    }

    private double lengthOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    private double squareOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
