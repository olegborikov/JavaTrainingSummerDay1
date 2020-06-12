package com.borikov.day2.task7.service;

import com.borikov.day2.task7.exception.InvalidDataException;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class BirthDayService {
    public Calendar convertToData(int dayOfBirthDay, int monthOfBirthDay,
                                  int yearOfBirthDay) {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(Calendar.YEAR, yearOfBirthDay);
        calendar.set(Calendar.MONTH, monthOfBirthDay - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfBirthDay);
        return calendar;
    }

    public boolean isBirthDayToday(Calendar date) {
        boolean result = false;
        Calendar today = new GregorianCalendar();
        if (date.get(Calendar.MONTH) == today.get(Calendar.MONTH)
                && date.get(Calendar.DATE) == today.get(Calendar.DATE)) {
            result = true;
        }
        return result;
    }

    public int getAge(Calendar date) throws InvalidDataException {
        int age = 0;
        Calendar today = new GregorianCalendar();
        age = today.get(Calendar.YEAR) - date.get(Calendar.YEAR);
        if (age < 0) {
            throw new InvalidDataException();
        }
        return age;
    }

    public String getDayOfWeek(Calendar date) {
        String dayOfWeek = date.getDisplayName(Calendar.DAY_OF_WEEK,
                Calendar.LONG, Locale.forLanguageTag("US"));
        return dayOfWeek;
    }
}
