package com.org.example.util;

import com.org.example.model.Meal;
import com.org.example.model.MealTo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MealsUtils {
    public static void main(String[] args) {
        List<Meal> meals = Arrays.asList(
                new Meal(LocalDateTime.of(2020, Month.FEBRUARY, 28, 7,0), "Завтрак", 500),
                new Meal(LocalDateTime.of(2020, Month.FEBRUARY, 28, 0,0), "Обед", 1000),
                new Meal(LocalDateTime.of(2020, Month.FEBRUARY, 28, 0,0), "Ужин", 500),
                new Meal(LocalDateTime.of(2020, Month.MARCH, 1, 12,0), "Завтрак", 500),
                new Meal(LocalDateTime.of(2020, Month.MARCH, 1, 0,0), "Обед", 500),
                new Meal(LocalDateTime.of(2020, Month.MARCH, 1,0,0),"Ужин", 1000)
        );
        System.out.println(getFilteredWithExcess(meals, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000));
    }
    public static List<MealTo> getFilteredWithExcess(List<Meal> meals, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        Map<LocalDate, Integer> caloriesSumByDate = meals.stream()
                .collect(
                        Collectors.groupingBy(Meal::getDate, Collectors.summingInt(Meal::getCalories))
                );
        return meals.stream()
                .filter(meal -> TimeUtil.isBetween(meal.getTime(), startTime, endTime))
                .map(meal -> new MealTo(meal.getDateTime(), meal.getDescription(), meal.getCalories(),
                        caloriesSumByDate.get(meal.getDate()) > caloriesPerDay))
                .collect(Collectors.toList());

    }
}
