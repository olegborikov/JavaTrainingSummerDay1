package com.borikov.day1.main;

import com.borikov.day1.entity.CoordinatePoint;
import com.borikov.day1.service.PointService;

public class PointMain {
    public static void main(String[] args) {
        PointService pointService = new PointService();

//      task 7 testing
        CoordinatePoint firstPoint =
                new CoordinatePoint("firstPoint", 2, 0);
        CoordinatePoint secondPoint =
                new CoordinatePoint("secondPoint", 2, 0);
        pointService.getNearestPoint(firstPoint, secondPoint);
    }
}

