package com.proftelran.org.lesson25.homework_09_01_2024;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println("Task # 2");
        // Создаем объект SimpleDateFormat с указанным форматом
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");

        // Создаем объект Date для заданной даты (10 января 1985 года)
        Calendar calendar = Calendar.getInstance();
        calendar.set(1985, Calendar.JANUARY, 10);
        Date date = calendar.getTime();

        // Форматируем дату с помощью SimpleDateFormat
        String formattedDate = simpleDateFormat.format(date);

        // Получаем день недели для заданной даты
        Calendar dayOfWeekCalendar = Calendar.getInstance();
        dayOfWeekCalendar.setTime(date);
        int dayOfWeek = dayOfWeekCalendar.get(Calendar.DAY_OF_WEEK);

        // Преобразуем числовое значение дня недели в текстовое представление
        String dayOfWeekText = getDayOfWeekText(dayOfWeek);

        // Выводим результат
        System.out.println("Дата: " + formattedDate);
        System.out.println("День недели: " + dayOfWeekText);
    }

    // Метод для преобразования числового значения дня недели в текстовое представление
    private static String getDayOfWeekText(int dayOfWeek) {
        String[] daysOfWeek = {"Воскресенье", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"};
        return daysOfWeek[dayOfWeek - 1];
    }
}