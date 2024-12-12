package edu.miu.cs.cs544.najeeb.springboot.myfirstrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("StudentRepository")
public interface Student extends JpaRepository<edu.miu.cs.cs544.najeeb.springboot.myfirstrest.entity.Student, Integer> {



}
