package com.proftelran.org.lesson25.homework_09_01_2024;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

import static java.util.Calendar.JANUARY;

public class TestDOBCalendar {

    public static void main(String[] args) {

        System.out.println("Task # 1");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        String format = simpleDateFormat.format(new Date(85, JANUARY, 10));
        System.out.println("Date of my birthday is " + format);

        System.out.println("Task # 3");
        LocalDate birthday = LocalDate.of(1985, 1, 10).minusYears(10);
        System.out.println("When decreasing the date by 10 years we receive yyyy/mm/dd = " + birthday);

        System.out.println("Task # 4");
        // Создаем объект Instant из строки времени
        String timestamp = "2022-12-19T06:55:30.00Z";
        Instant instant = Instant.parse(timestamp);

        System.out.println("Task # 5");
        // Выводим на консоль
        System.out.println("Instant: " + instant);

        // Создаем объект ZonedDateTime для временной зоны "Pacific/Midway"
        ZoneId zoneId = ZoneId.of("Pacific/Midway");
        ZonedDateTime zdt = ZonedDateTime.now(zoneId);

        // Выводим на консоль
        System.out.println("ZonedDateTime: " + zdt);
    }
}