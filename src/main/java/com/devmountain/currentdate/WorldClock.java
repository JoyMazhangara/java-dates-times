package com.devmountain.currentdate;

import java.time.*;

public class WorldClock {

    public LocalDate getNowForDate() {
        LocalDate localDate = LocalDate.now();
        return localDate;
    }

    public LocalDateTime getNowForDateAndTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime;
    }

    public DayOfWeek getDayOfWeekForNow() {
        LocalDate localDate = LocalDate.now();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek;
    }

    public int getDayOfMonthForNow() {
        LocalDate localDate = LocalDate.now();
        int dayOfMonth = localDate.getDayOfMonth();
        return dayOfMonth;
    }

    public int getDayOfYearForNow() {
        LocalDate localDate = LocalDate.now();
        int dayOfYear = localDate.getDayOfYear();
        return dayOfYear;
    }

    public ZonedDateTime getNowDateTimeForNewYork() {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime newYorkDateTime = now.withZoneSameInstant(ZoneId.of("America/New_York"));
        return newYorkDateTime;
    }

    public ZonedDateTime getNowDateTimeForLA() {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime laDateTime = now.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        return laDateTime;
    }

    public ZonedDateTime getNowDateTimeForLondon() {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime londonDateTime = now.withZoneSameInstant(ZoneId.of("Europe/London"));
        return londonDateTime;
    }

    public ZonedDateTime getNowDateTimeForMoscow() {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime moscowDateTime = now.withZoneSameInstant(ZoneId.of("Europe/Moscow"));
        return moscowDateTime;
    }

    public ZonedDateTime getNowDateTimeForTokyo() {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime tokyoDateTime = now.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        return tokyoDateTime;
    }



}
