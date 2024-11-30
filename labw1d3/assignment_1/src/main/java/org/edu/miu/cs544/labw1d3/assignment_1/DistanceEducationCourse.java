package org.edu.miu.cs544.labw1d3.assignment_1;

import jakarta.persistence.Entity;

import java.util.Date;
import java.util.List;

@Entity
public class DistanceEducationCourse extends Course {
    String examProfessor;

    List<Date> webinarDate;
    public DistanceEducationCourse() {
        super();
    }
    public DistanceEducationCourse(
            String title, String name, Date startDate, String professor, String examProfessor,
            List<Date> webinarSessionDate) {
        super(title, name, startDate, professor);
        this.examProfessor = examProfessor;
        this.webinarDate = webinarSessionDate;
    }
    public String getExamProfessor() {
        return examProfessor;
    }
    public void setExamProfessor(String examProfessor) {
        this.examProfessor = examProfessor;
    }
    public List<Date> getWebinarDate() {
        return webinarDate;
    }
    public void setWebinarDate(List<Date> webinarSessionDate) {
        this.webinarDate = webinarSessionDate;
    }
}
