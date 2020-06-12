package com.borikov.day2.task6.service;

import com.borikov.day2.task6.exception.InvalidDataException;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DeveloperService {
    public Calendar getDeadLine(String name, int days) throws InvalidDataException {
        if (days > 0 && days < 1000) {
            Calendar deadLine = new GregorianCalendar();
            deadLine.add(Calendar.DATE, days);
            return deadLine;
        } else {
            throw new InvalidDataException();
        }
    }
}
