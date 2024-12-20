package org.edu.miu.cs.cs544.final_exam.repository;

import org.edu.miu.cs.cs544.final_exam.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
    public Actor save(Actor actor);
    public void deleteById(Long id);
    public Actor getById(Long id);
//    public Actor update(Actor actor);

    public Actor findActorsByName(String name);

    @Query("SELECT a FROM Actor a WHERE a.experience > 3")
    public List<Actor> findAmericanActorsHasMoreThan3YearsExperience();
}
