package com.borikov.day2.task5.service;

import com.borikov.day2.task5.exception.InvalidDataException;

public class ArithmeticService {
    public double getMultiplicationOfArray(double[] arr) throws InvalidDataException {
        double multiplication = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > -1000 && arr[i] < 1000) {
                multiplication *= arr[i];
            } else {
                throw new InvalidDataException();
            }
        }
        return multiplication;
    }

    public double getSumOfArray(double[] arr) throws InvalidDataException {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > -1000 && arr[i] < 1000) {
                sum += arr[i];
            } else {
                throw new InvalidDataException();
            }
        }
        return sum;
    }
}
