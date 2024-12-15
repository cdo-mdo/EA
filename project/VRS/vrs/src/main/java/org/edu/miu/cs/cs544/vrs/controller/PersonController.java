package org.edu.miu.cs.cs544.vrs.controller;

import org.edu.miu.cs.cs544.vrs.Entity.Person;
import org.edu.miu.cs.cs544.vrs.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    @GetMapping("/persons/nameprefix/{prefix}")
    public List<Person> getPersonsByNameStartWith(@PathVariable String prefix) {
        return personService.getPersonsByNameStartWith(prefix);
    }

    @GetMapping("/persons/{id}")
    public Person getPersonById(@PathVariable Long id) {
    	return personService.getPersons().get(id.intValue());
    }

    @GetMapping("/persons/email/{email}")
    public Person getPersonByEmail(@PathVariable String email) {
        return personService.getPersonByEmail(email);
    }

    @GetMapping("/persons/mobile/{mobileNumber}")
    public Person getPersonByMobileNumber(@PathVariable String mobileNumber) {
        return personService.getPersonByMobileNumber(mobileNumber);
    }

    @GetMapping("/persons/name/{str}")
    public List<Person> getPersonsByNameContains(@PathVariable String str) {
    	return personService.getPersonsByNameContains(str);
    }

    @GetMapping("/persons/emailcontains/{str}")
    public List<Person> getPersonByEmailContains(@PathVariable String str) {
        return personService.getPersonByEmailContains(str);
    }

    @GetMapping("/persons/name1/{name}")
    public Person get1(@PathVariable String name) {
        return personService.getPersonsByName1(name);
    }

    @PostMapping("/person")
    public Person addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }
}
