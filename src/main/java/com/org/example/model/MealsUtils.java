package com.org.example.model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class MealsUtils {
    public static void main(String[] args) {
        List<Meal> meals = Arrays.asList(
                new Meal(LocalDateTime.of(2020, Month.FEBRUARY, 28, 0,0), "Завтрак", 500),
                new Meal(LocalDateTime.of(2020, Month.FEBRUARY, 28, 0,0), "Обед", 1000),
                new Meal(LocalDateTime.of(2020, Month.FEBRUARY, 28, 0,0), "Ужин", 500),
                new Meal(LocalDateTime.of(2020, Month.MARCH, 1, 0,0), "Завтрак", 500),
                new Meal(LocalDateTime.of(2020, Month.MARCH, 1, 0,0), "Обед", 500),
                new Meal(LocalDateTime.of(2020, Month.MARCH, 1,0,0),"Ужин", 1000)
        );
        getFilteredWithExcess(meals, LocalTime.of(7,0), LocalTime.of(12, 0), 2000);
    }
    public static List<MealTo> getFilteredWithExcess(List<Meal> meals, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        // TODO: 03.06.2023
        return null;
    }
}
