package org.edu.miu.cs.cs544.final_exam.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private int year;
    private int rating;
    private Genre genre;

    @OneToMany (mappedBy = "movie")
    private Collection<Actor> actors;

    public Movie() {

    }
    public Movie(String name, int year, int rating, Genre genre) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
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
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public Collection<Actor> getActors() {
        return actors;
    }
    public void setActors(Collection<Actor> actors) {
        this.actors = actors;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                ", genre=" + genre +
                '}';
    }
}
