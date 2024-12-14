package org.edu.miu.cs.cs544.labw3d3.assignment_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository( "StudentRepository")
public interface Student extends JpaRepository<org.edu.miu.cs.cs544.labw3d3.assignment_2.entity.Student, Long> {

}
