package org.edu.miu.cs.cs544.labw3d3.exercise_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("StudentRepository")
public interface Student extends JpaRepository<org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student, Integer> {

}
