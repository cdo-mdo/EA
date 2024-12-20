package org.edu.miu.cs.cs544.final_exam.service;

import org.edu.miu.cs.cs544.final_exam.entity.Movie;
import org.edu.miu.cs.cs544.final_exam.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public String getAllMovie() {
        return movieRepository.findAll().toString();
    }

    public List<Movie> getMovieByYearAndRating(int year, int rating) {
        return movieRepository.findMoviesByYearAndRating(year, rating);
    }
}
