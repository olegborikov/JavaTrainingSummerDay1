package com.borikov.day1.main;

import com.borikov.day1.service.FunctionService;

public class FunctionMain {
    public static void main(String[] args) {
        FunctionService functionService = new FunctionService();

//       task 8
        double number = 0;
        functionService.calculateFunction(number);

//       task 8
        double a = 10;
        double b = 20;
        double h = 1;
        functionService.getTableOfTangentFunction(a, b, h);
    }
}
