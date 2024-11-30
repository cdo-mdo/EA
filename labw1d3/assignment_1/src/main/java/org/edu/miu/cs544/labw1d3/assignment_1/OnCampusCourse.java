package org.edu.miu.cs544.labw1d3.assignment_1;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class OnCampusCourse extends Course {
    private String room;
    private Integer capacity;
    public OnCampusCourse() {
        super();
    }
    public OnCampusCourse(String title, String name, Date startDate, String professor, String room, Integer capacity) {
        super(title, name, startDate, professor);
        this.room = room;
        this.capacity = capacity;
    }
    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public Integer getCapacity() {
        return capacity;
    }
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
