package com.borikov.day1.main;

import com.borikov.day1.service.ShapeService;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeService shapeService = new ShapeService();

//        task 3 testing
        int number = 10;
        shapeService.getAreaOfInscribedSquareByAreaOfDescribedSquare(number);

//        task 9 testing
        int number1 = 10;
        shapeService.getLengthAndSquareOfCircle(number1);
    }
}
