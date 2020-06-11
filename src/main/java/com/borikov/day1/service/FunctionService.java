package com.borikov.day1.service;

import com.borikov.day1.exception.IncorrectDataException;
import com.borikov.day1.validator.ArithmeticValidator;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.*;

public class FunctionService {

    // task 8
    public double getCustomFunction(double x) throws IncorrectDataException {
        ArithmeticValidator arithmeticValidator = new ArithmeticValidator();
        if (arithmeticValidator.isNumberInLimit(x)) {
            throw new IncorrectDataException();
        }
        double result;
        if (x >= 3) {
            result = calculateFirstStatement(x);
        } else {
            result = calculateSecondStatement(x);
        }
        return result;
    }

    private static double calculateFirstStatement(double x) {
        return -1 * pow(x, 2) + 3 * x + 9;
    }

    private static double calculateSecondStatement(double x) {
        return 1 / (pow(x, 3) - 6);
    }

    // task 10
    public Map<Double, Double> getTangentFunction(double start, double end, double step) throws IncorrectDataException {
        ArithmeticValidator arithmeticValidator = new ArithmeticValidator();
        if (arithmeticValidator.isNumberBetween(start, end, step)) {
            throw new IncorrectDataException();
        }
        Map<Double, Double> tangentFunction = new HashMap<>();
        for (double i = start; (i <= end && (start < end && step > 0))
                || (i >= end && (start > end && step < 0)); i += step) {
            tangentFunction.put(i, tan(i));
        }
        return tangentFunction;
    }
}
