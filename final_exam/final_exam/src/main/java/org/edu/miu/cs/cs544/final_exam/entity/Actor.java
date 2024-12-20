package org.edu.miu.cs.cs544.final_exam.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private Date dob;
    private int experience;
    private String country;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    public Actor() {
    }
    public Actor(String name, Date dob, int experience, String country) {
        this.name = name;
        this.dob = dob;
        this.experience = experience;
        this.country = country;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Movie getMovie() {
        return movie;
    }
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", experience=" + experience +
                ", country='" + country + '\'' +
                '}';
    }
}

