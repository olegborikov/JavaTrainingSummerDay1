package com.borikov.day1.service;

import com.borikov.day1.console.PointPrint;
import com.borikov.day1.entity.CoordinatePoint;
import com.borikov.day1.validation.PointValidation;

public class PointService {
    PointPrint pointPrint = new PointPrint();
    PointValidation pointValidation = new PointValidation();

    // task 7
    public void getNearestPoint(CoordinatePoint firstPoint,
                                CoordinatePoint secondPoint) {
        if (pointValidation.isPointInLimit(firstPoint.getX(),
                firstPoint.getY())
                && pointValidation.isPointInLimit(secondPoint.getX(),
                secondPoint.getY())) {
            double firstPointDistance =
                    lengthToOrigin(firstPoint.getX(), firstPoint.getY());
            double secondPointDistance =
                    lengthToOrigin(secondPoint.getX(), secondPoint.getY());

            if (firstPointDistance > secondPointDistance) {
                pointPrint.printNearestPoint(secondPoint.getName(),
                        firstPoint.getName());
            } else if (firstPointDistance < secondPointDistance) {
                pointPrint.printNearestPoint(firstPoint.getName(),
                        secondPoint.getName());
            } else {
                pointPrint.printEqualsPoint(firstPoint.getName(),
                        secondPoint.getName());
            }
        } else {
            pointPrint.printIncorrectValidation();
        }
    }

    private double lengthToOrigin(double x, double y) {
        return Math.hypot(x, y);
    }

}
