package com.borikov.day1.service;

import com.borikov.day1.entity.Point;
import com.borikov.day1.exception.IncorrectDataException;
import com.borikov.day1.validator.PointValidator;

import static java.lang.Math.*;

public class PointService {

    // task 7
    public Point getNearestPoint(Point firstPoint, Point secondPoint) throws IncorrectDataException {
        PointValidator pointValidator = new PointValidator();
        if (pointValidator.isPointInLimit(firstPoint.getX(), firstPoint.getY())
                && pointValidator.isPointInLimit(secondPoint.getX(), secondPoint.getY())) {
            throw new IncorrectDataException();
        }
        double firstPointDistance =
                calculateLengthToOrigin(firstPoint.getX(), firstPoint.getY());
        double secondPointDistance =
                calculateLengthToOrigin(secondPoint.getX(), secondPoint.getY());
        Point closerPoint;
        if (firstPointDistance < secondPointDistance) {
            closerPoint = firstPoint;
        } else {
            closerPoint = secondPoint;
        }
        return closerPoint;
    }

    private double calculateLengthToOrigin(double x, double y) {
        return hypot(x, y);
    }
}
