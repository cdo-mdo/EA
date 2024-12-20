package org.edu.miu.cs.cs544.final_exam.controller;

import org.edu.miu.cs.cs544.final_exam.entity.Movie;
import org.edu.miu.cs.cs544.final_exam.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public String getMovie() {
        return movieService.getAllMovie();
    }

    @GetMapping("/movies/{year}/{rating}")
    public List<Movie> getMovieByYearAndRating(int year, int rating) {
        return movieService.getMovieByYearAndRating(year, rating);
    }
    @GetMapping("/rand")
    public String getRandom() {
        Map<Integer, String> maps = new HashMap<>();
        maps.put(1, "Monday");
        maps.put(2, "Tuesday");
        maps.put(3, "Wednesday");
        maps.put(4, "Thursday");
        maps.put(5, "Friday");
        maps.put(6, "Saturday");
        maps.put(7, "Sunday");
        int random = (int) (Math.random() * 7);
        return maps.get(random);
    }
}
