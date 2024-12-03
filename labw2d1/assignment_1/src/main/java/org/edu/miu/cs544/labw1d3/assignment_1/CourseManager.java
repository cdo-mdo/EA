package org.edu.miu.cs544.labw1d3.assignment_1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CourseManager {
    public static Course createSTCCourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.AUGUST);
        calendar.set(Calendar.DAY_OF_MONTH, 19);
        return new OnCampusCourse(
                "CS500", "STC Pt 1- ComPro (Science and Technology of Consciousness)",
                calendar.getTime(), "Elinor Wolfe", "Dalby Hall", 100);
    }

    public static Course createFPPCourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 2);
        return new OnCampusCourse(
                "CS390", "Fundamental Programming Practices",
                calendar.getTime(), "Micheal Zijlstra", "McLau-Rm 218", 30);
    }

    public static Course createMPPCourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return new OnCampusCourse(
                "CS401", "Modern Programming Practices",
                calendar.getTime(), "Micheal Zijlstra", "McLau-Rm 115", 30);
    }

    public static Course createAlgorithmCourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 28);
        return new OnCampusCourse(
                "CS435", "Algorithms",
                calendar.getTime(), "Premchand Nair", "Verri-Rm 29", 40);
    }

    public static Course createEACourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        return new OnCampusCourse(
                "CS544", "Enterprise Architecture",
                calendar.getTime(), "Najeeb Najeeb", "McLau-Rm 218", 30);
    }

    public static Course createWAPCourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 13);
        return new OnCampusCourse(
                "CS472", "Web Programming",
                calendar.getTime(), "Ankhtuya Ochirbat", "McLau-Rm 218", 30);
    }

    public static Course createIRCourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 10);
        return new OnCampusCourse(
                "FOR438", "Ideal Relationships (with 6-day TM Retreat or WPA)",
                calendar.getTime(), "Vicki Alexander Herriott", "RectCenter", 50);
    }

    public static Course createWAACourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 24);
        return new OnCampusCourse(
                "CS545", "Web Application Architecture",
                calendar.getTime(), "Muhyieddin Khaled Al-Tarawneh", "McLau-Rm 218", 30);
    }

    public static Course createCSCourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        return new OnCampusCourse(
                "MGT5341", "Career Strategies for Information Technology",
                calendar.getTime(), "Natasha Berkowitz", "Verri-Rm 44", 50);
    }

    public static Course createDBMSCourse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 14);
        return new OnCampusCourse(
                "CS422A10DE", "Database Management Systems",
                calendar.getTime(), "Ankhtuya Ochirbat", "Verri-Rm 29", 30);
    }

    public static Course createSECourse() {
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

        /*
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
*/
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

        System.out.println("Number of webinars: " + webinarDates.size());

        return new DistanceEducationCourse(
                "CS42512", "Software Engineering",
                calendar.getTime(), "Malasani, Sridevi", "Premchand Nair", webinarDates);
    }

    public static Course createASDCourse() {
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

        /*
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
        */

        return new DistanceEducationCourse(
                "CS48911", "Applied Software Development",
                calendar.getTime(), "Varghese, Bright", "Tayyab, Muhammad", webinarDates);
    }

    public static Course createCCCourse() {
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

        /*
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
        */

        return new DistanceEducationCourse(
                "CS51610", "Cloud Computing",
                calendar.getTime(), "Vu, Thao", "Vu, Thao", webinarDates);
    }

    public static Course createBDCourse() {
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

        /*
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
        */

        return new DistanceEducationCourse(
                "CS5227DE", "Big Data",
                calendar.getTime(), "Najeeb, Najeeb", "Najeeb, Najeeb", webinarDates);
    }

    public static Course createAdSDCourse() {
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

        /*
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
        */

        return new DistanceEducationCourse(
                "CS5257AUG", "Advanced Software Development",
                calendar.getTime(), "De Jong, Rene", "De Jong, Rene", webinarDates);
    }
}
