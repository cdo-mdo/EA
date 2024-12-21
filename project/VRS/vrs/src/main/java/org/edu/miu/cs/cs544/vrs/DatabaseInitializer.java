package org.edu.miu.cs.cs544.vrs;

import org.edu.miu.cs.cs544.vrs.Entity.*;
import org.edu.miu.cs.cs544.vrs.init.*;
import org.edu.miu.cs.cs544.vrs.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private CustomerRepository customerRepository;

    private void createPerson() {
        personRepository.save(new Person("Jack", "555-123-4561", "jack@example.com"));
        personRepository.save(new Person("Jill", "555-123-4562", "jill@example.com"));
        personRepository.save(new Person("John", "555-123-4563", "john@example.com"));
        personRepository.save(new Person("Jane", "555-123-4564", "jane@example.com"));
        personRepository.save(new Person("Joe", "555-123-4565", "joe@example.com"));
        personRepository.save(new Person("Joseph", "555-123-4566", "joseph@example.com"));
        personRepository.save(new Person("Joshua", "555-123-4567", "joshua@example.com"));
        personRepository.save(new Person("Jason", "555-123-4568", "jason@example.com"));
        personRepository.save(new Person("Jacob", "555-123-4569", "jacob@example.com"));
        personRepository.save(new Person("James", "555-123-4570", "james@example.com"));
    }

    private void createCustomer() {
        customerRepository.save(new Customer("Ben", "555-101-1121", "ben@example.com",
                "B123456789", MembershipLevel.BASIC));
        customerRepository.save(new Customer("Bea", "555-202-2232", "bea@example.com",
                "B234567890", MembershipLevel.BASIC));
        customerRepository.save(new Customer("Belle", "555-303-3343", "belle@example.com",
        "B345678901", MembershipLevel.BASIC));
        customerRepository.save(new Customer("Blair", "555-404-4454", "blair@example.com",
                "B456789012", MembershipLevel.BASIC));
        customerRepository.save(new Customer("Black", "555-505-5565", "blake@example.com",
                "B567890123", MembershipLevel.PREMIUM));
        customerRepository.save(new Customer("Bo", "555-606-6676", "bo@example.com",
                "B678901234", MembershipLevel.PREMIUM));
        customerRepository.save(new Customer("Bree", "555-707-7787", "bree@example.com",
                "B789012345", MembershipLevel.PREMIUM));
        customerRepository.save(new Customer("Brock", "555-808-8898", "brock@example.com",
                "B890123456", MembershipLevel.VIP));
        customerRepository.save(new Customer("Bryce", "555-909-9909", "bryce@example.com",
                "B901234567", MembershipLevel.VIP));
        customerRepository.save(new Customer("Brynn", "555-111-0011", "brynn@example.com",
                "B012345678", MembershipLevel.VIP));
    }

    @Autowired
    private InitRole initRole;

    @Autowired
    private InitUser initUser;

    @Autowired
    private InitBranch initBranch;

    @Autowired
    private InitEmployee initEmployee;

    @Autowired
    private InitVehicle initVehicle;

    @Override
    public void run(String... args) throws Exception {
        initRole.initData();
        initUser.initData();
        initBranch.initData();
        initEmployee.initData();
        initVehicle.initData();

        createPerson();
        createCustomer();
    }
}
