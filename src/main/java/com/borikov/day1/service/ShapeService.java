package com.borikov.day1.service;

import com.borikov.day1.exception.IncorrectDataException;
import com.borikov.day1.validator.ArithmeticValidator;

import static java.lang.Math.*;

public class ShapeService {

    // task 3
    public double getAreaOfInscribedSquare(
            double areaOfDescribedSquare) throws IncorrectDataException {
        ArithmeticValidator arithmeticValidator = new ArithmeticValidator();
        if (arithmeticValidator.isNumberPositive(areaOfDescribedSquare)) {
            throw new IncorrectDataException();
        }
        double side = sqrt(areaOfDescribedSquare);
        double areaOfInscribedSquare = side * side / 2;
        return areaOfDescribedSquare / areaOfInscribedSquare;
    }

    // task 9
    public double[] getLengthAndSquareOfCircle(double radius) throws IncorrectDataException {
        ArithmeticValidator arithmeticValidator = new ArithmeticValidator();
        if (arithmeticValidator.isNumberPositive(radius)) {
            throw new IncorrectDataException();
        }
        double length = calculateLengthOfCircle(radius);
        double square = calculateSquareOfCircle(radius);
        return new double[]{length, square};
    }

    private double calculateLengthOfCircle(double radius) {
        return 2 * PI * radius;
    }

    private double calculateSquareOfCircle(double radius) {
        return PI * pow(radius, 2);
    }
}
