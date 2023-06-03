package com.org.example.model;

import java.time.LocalDateTime;

public class MealTo {
    private final LocalDateTime dateTime;
    private final String description;
    private final int calories;
    private final boolean axcess;

    public MealTo(LocalDateTime dateTime, String description, int calories, boolean axcess) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
        this.axcess = axcess;
    }

    @Override
    public String toString() {
        return "MealTo{" +
                "dateTime=" + dateTime +
                ", description='" + description + '\'' +
                ", calories=" + calories +
                ", axcess=" + axcess +
                '}';
    }
}
