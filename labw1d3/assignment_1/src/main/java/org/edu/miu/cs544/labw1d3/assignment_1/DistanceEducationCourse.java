package org.edu.miu.cs544.labw1d3.assignment_1;

import java.util.Date;
import java.util.List;

public class DistanceEducationCourse extends Course {
    String examProfessor;
    List<Date> webinarSessionDate;
    public DistanceEducationCourse() {
        super();
    }
    public DistanceEducationCourse(
            String title, Date startDate, String professor, String examProfessor,
            List<Date> webinarSessionDate) {
        super(title, startDate, professor);
        this.examProfessor = examProfessor;
        this.webinarSessionDate = webinarSessionDate;
    }
    public String getExamProfessor() {
        return examProfessor;
    }
    public void setExamProfessor(String examProfessor) {
        this.examProfessor = examProfessor;
    }
    public List<Date> getWebinarSessionDate() {
        return webinarSessionDate;
    }
    public void setWebinarSessionDate(List<Date> webinarSessionDate) {
        this.webinarSessionDate = webinarSessionDate;
    }
}
