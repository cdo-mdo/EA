package org.edu.miu.cs544.labw1d3.assignment_1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CourseManager {
    public static Course createSTCourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.AUGUST);
        calendar.set(Calendar.DAY_OF_MONTH, 19);
        return new OnCampusCourse(
                "STC", calendar.getTime(), "Elinor Wolf", "Dalby Hall", 100);
    }

    public static Course createFPPCourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 2);
        return new OnCampusCourse(
                "FPP", calendar.getTime(), "Micheal Zijlstra", "ML218", 30);
    }

    public static Course createMPPCourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return new OnCampusCourse(
                "MPP", calendar.getTime(), "Micheal Zijlstra", "ML112", 30);
    }

    public static Course createAlgorithmCourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 28);
        return new OnCampusCourse(
                "Algorithm", calendar.getTime(), "Prem Nair", "VH29", 40);
    }

    public static Course createEACourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        return new OnCampusCourse(
                "EA", calendar.getTime(), "Najeeb Najeeb", "ML218", 30);
    }

    public static Course createWMACourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.MAY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date startDate = calendar.getTime();

        List<Date> webinarDates = new ArrayList<Date>();

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.MAY);
        calendar.set(Calendar.DAY_OF_MONTH, 4);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.MAY);
        calendar.set(Calendar.DAY_OF_MONTH, 11);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.MAY);
        calendar.set(Calendar.DAY_OF_MONTH, 18);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.MAY);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 8);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 22);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 29);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JULY);
        calendar.set(Calendar.DAY_OF_MONTH, 6);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 13);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 20);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 27);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.AUGUST);
        calendar.set(Calendar.DAY_OF_MONTH, 3);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 10);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 17);
        webinarDates.add(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        webinarDates.add(calendar.getTime());

        return new DistanceEducationCourse(
                "WAA", calendar.getTime(), "Najeeb Najeeb", "Prem Nair", webinarDates);
    }
}
