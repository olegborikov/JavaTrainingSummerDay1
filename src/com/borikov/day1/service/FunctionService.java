package com.borikov.day1.service;

import com.borikov.day1.console.FunctionPrint;
import com.borikov.day1.validation.ArithmeticValidation;

public class FunctionService {
    ArithmeticValidation arithmeticValidation = new ArithmeticValidation();
    FunctionPrint functionPrint = new FunctionPrint();

    // task 8
    public void calculateFunction(double x) {
        if (arithmeticValidation.isNumberInLimit(x)) {
            double result;
            if (x >= 3) {
                result = getFirstStatement(x);
            } else {
                result = getSecondStatement(x);
            }
            functionPrint.printCalculateFunction(result);
        } else {
            functionPrint.printIncorrectValidation();
        }
    }

    private static double getFirstStatement(double x) {
        return -1 * Math.pow(x, 2) + 3 * x + 9;
    }

    private static double getSecondStatement(double x) {
        return 1 / (Math.pow(x, 3) - 6);
    }

    // task 10
    public void getTableOfTangentFunction(double start, double end, double step) {
        if (arithmeticValidation.isNumberBetween(start, end, step)) {
            functionPrint.printHeadTableOfTangentFunction();
            for (double i = start; (i <= end && (start < end && step > 0))
                    || (i >= end && (start > end && step < 0)); i += step) {
                functionPrint.printBodyTableOfTangentFunction(i, Math.tan(i));
            }
        } else {
            functionPrint.printIncorrectValidation();
        }
    }
}
