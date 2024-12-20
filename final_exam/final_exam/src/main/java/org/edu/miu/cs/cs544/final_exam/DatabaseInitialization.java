package org.edu.miu.cs.cs544.final_exam;

import org.edu.miu.cs.cs544.final_exam.entity.Actor;
import org.edu.miu.cs.cs544.final_exam.entity.Genre;
import org.edu.miu.cs.cs544.final_exam.entity.Movie;
import org.edu.miu.cs.cs544.final_exam.repository.ActorRepository;
import org.edu.miu.cs.cs544.final_exam.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Component
public class DatabaseInitialization implements CommandLineRunner {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ActorRepository actorRepository;

    Actor actor1 = new Actor("Leo", java.sql.Date.valueOf(LocalDate.of(1974, 11, 11)),
            30, "USA");
    Actor actor2 = new Actor("Emma", java.sql.Date.valueOf(LocalDate.of(1990, 4, 15)),
            22, "France");
    Actor actor3 = new Actor("Tom", java.sql.Date.valueOf(LocalDate.of(1956, 9, 7)),
        45, "USA");




    Movie movie1 = new Movie("M1", 2000, 10, Genre.ACTION);
    Movie movie2 = new Movie("M2", 2001, 10, Genre.COMEDY);
    Movie movie3 = new Movie("M3", 2002, 10, Genre.DRAMA);

    private void createActors() {
        actorRepository.save(actor1);
        actorRepository.save(actor2);
        actorRepository.save(actor3);
    }

    private void createMovies() {
        List<Actor> actors1 = new ArrayList<>();
        actors1.add(actor1);
        movie1.setActors(actors1);

        List<Actor> actors2 = new ArrayList<>();
        actors2.add(actor2);
        actors2.add(actor3);
        movie2.setActors(actors2);

        movieRepository.save(movie1);
        movieRepository.save(movie2);
        movieRepository.save(movie3);
    }



    @Override
    public void run(String... args) throws Exception {
        createActors();
        createMovies();
    }
}
