package com.borikov.day2.task3.service;

import com.borikov.day2.task3.exception.InvalidDataException;

import java.util.Random;

public class RandomService {
    public static final int MAX_VALUE = 1000;
    public static final int MIN_VALUE = -1000;

    public int[] getRandomArray(int amountOfNumbers) throws InvalidDataException {
        if (amountOfNumbers > 0 && amountOfNumbers < 1000) {
            int[] allNumbers = new int[amountOfNumbers];
            for (int i = 0; i < amountOfNumbers; i++) {
                allNumbers[i] = generateRandomNumber();
            }
            return allNumbers;
        } else {
            throw new InvalidDataException();
        }
    }

    private int generateRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt((MAX_VALUE - MIN_VALUE) + 1);
        return randomNumber;
    }
}
