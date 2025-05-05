package com.linkedin.app;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

public class WeekdayTests {

    @Test
    @EnabledIf("isWeekday")
    void weekdays() {
        System.out.println("This test runs only on weekdays.");
    }

    @Test
    @DisabledIf("isWeekday")
    void weekends() {
        System.out.println("This test runs only on weekends.");
    }

    private boolean isWeekday() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        return dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY;
    }
}