package org.edu.miu.cs.cs544.vrs.service;

import org.edu.miu.cs.cs544.vrs.Entity.Person;
import org.edu.miu.cs.cs544.vrs.exception.ObjectNotFoundException;
import org.edu.miu.cs.cs544.vrs.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    public Person getPersonById(Long id) {
        Optional<Person> person = personRepository.findById(id);
        if (person.isPresent()) {
            return person.get();
        }
        else {
            throw new ObjectNotFoundException(
                    "Person with id " + id + " not found");
        }
    }

    public Person getPersonByEmail(String email) {
        Person person = personRepository.findByEmail(email);
        if (person == null) {
            throw new ObjectNotFoundException(
                    "Person with email " + email + " not found");
        }
        return person;
    }

    public Person getPersonByMobileNumber(String mobileNumber) {
        Person person = personRepository.findByMobileNumber(mobileNumber);
        if (person == null) {
            throw new ObjectNotFoundException(
                    "Person with mobile number " + mobileNumber + " not found");
        }
        return person;
    }

    public List<Person> getPersonsByNameStartWith(String namePrefix) {
        return personRepository.findAllByNamePrefix(namePrefix);
    }

    public List<Person> getPersonsByNameContains(String str) {
    	return personRepository.findAllByNameContains(str);
    }

    public List<Person> getPersonByEmailContains(String email) {
    	return personRepository.findAllByEmailContains(email);
    }

    public Person getPersonsByName1(String name) {
        System.out.println("name: " + name);
        return personRepository.findByName(name);
    }

    public Person addPerson(Person person) {
        return personRepository.save(person);
    }
}
