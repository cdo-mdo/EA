package org.edu.miu.cs.cs544.final_exam.repository;

import org.edu.miu.cs.cs544.final_exam.entity.Genre;
import org.edu.miu.cs.cs544.final_exam.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository  extends JpaRepository<Movie, Long> {
    public Movie save(Movie movie);
    public void deleteById(Long id);
    public Movie getById(Long id);
//    public Movie update(Movie movie);

    public List<Movie> findMoviesByGenre(Genre genre);
    public List<Movie> findMoviesByYearAndRating(int year, int rating);

    @Query("SELECT m FROM Movie m WHERE SIZE(m.actors) = (SELECT min(SIZE(m2.actors)) FROM Movie m2) ORDER BY m.rating DESC")
    public List<Movie> findMoviesWithHighestRateAndLeastActor();
}
