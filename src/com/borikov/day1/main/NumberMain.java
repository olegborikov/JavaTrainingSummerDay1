package com.borikov.day1.main;

import com.borikov.day1.service.NumberService;

public class NumberMain {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();

//      task 1 testing
        int number = -13;
        numberService.getLastNumberOfSquare(number);

//      task 4 testing
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        numberService.isTwoEvenNumbers(a, b, c, d);

//      task 5 testing
        int number1 = 0;
        numberService.isPerfectNumber(number1);
    }
}
