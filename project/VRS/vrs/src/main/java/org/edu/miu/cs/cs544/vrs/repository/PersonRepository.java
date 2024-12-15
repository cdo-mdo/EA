package org.edu.miu.cs.cs544.vrs.repository;

import org.edu.miu.cs.cs544.vrs.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("PersonRepository")
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByEmail(String email);

    Person findByMobileNumber(String mobileNumber);

    List<Person> findAllByNameContains(String str);

    @Query("SELECT p FROM Person p WHERE p.name LIKE ?1%")
    List<Person> findAllByNamePrefix(String namePrefix);

    @Query(name = "Person.findByName1", nativeQuery = true)
    Person findByName(String name);

    @Query(value = "SELECT * FROM Person WHERE email LIKE ?1", nativeQuery = true)
    List<Person> findAllByEmailContains(String email);
}

