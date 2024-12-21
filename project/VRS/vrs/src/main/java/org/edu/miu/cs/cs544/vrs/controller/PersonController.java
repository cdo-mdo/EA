package org.edu.miu.cs.cs544.vrs.controller;

import org.edu.miu.cs.cs544.vrs.Entity.*;
import org.edu.miu.cs.cs544.vrs.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    @GetMapping("/nameprefix/{prefix}")
    public List<Person> getPersonsByNameStartWith(@PathVariable String prefix) {
        return personService.getPersonsByNameStartWith(prefix);
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
    	return personService.getPersons().get(id.intValue());
    }

    @GetMapping("/email/{email}")
    public Person getPersonByEmail(@PathVariable String email) {
        return personService.getPersonByEmail(email);
    }

    @GetMapping("/mobile/{mobileNumber}")
    public Person getPersonByMobileNumber(@PathVariable String mobileNumber) {
        return personService.getPersonByMobileNumber(mobileNumber);
    }

    @GetMapping("/name/{str}")
    public List<Person> getPersonsByNameContains(@PathVariable String str) {
    	return personService.getPersonsByNameContains(str);
    }

    @GetMapping("/emailcontains/{str}")
    public List<Person> getPersonByEmailContains(@PathVariable String str) {
        return personService.getPersonByEmailContains(str);
    }

    @GetMapping("/name1/{name}")
    public Person get1(@PathVariable String name) {
        return personService.getPersonsByName1(name);
    }

    @PostMapping("/person")
    public Person addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @GetMapping("/employees/role/{role}")
    public List<Employee> getEmployeesByRole(@PathVariable Role role) {
        return personService.getEmployeesByRole(role);
    }

    @GetMapping("/employees/shift/{shiftSchedule}")
    public List<Employee> getEmployeesByShift(@PathVariable ShiftSchedule shiftSchedule) {
        return personService.getEmployeesByShiftSchedule(shiftSchedule);
    }

    @GetMapping("/customers/membership/{level}")
    public List<Customer> getCustomersByMembership(@PathVariable MembershipLevel level) {
        return personService.getCustomersByMembershipLevel(level);
    }

    @GetMapping("/customers/license/{driverLicenseNumber}")
    public Customer getCustomerByLicense(@PathVariable String driverLicenseNumber) {
        return personService.getCustomerByDriverLicenseNumber(driverLicenseNumber);
    }
}
