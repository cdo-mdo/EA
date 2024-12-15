package org.edu.miu.cs.cs544.vrs;

import org.edu.miu.cs.cs544.vrs.Entity.*;
import org.edu.miu.cs.cs544.vrs.config.VehicleConfig;
import org.edu.miu.cs.cs544.vrs.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    Branch branch1 = new Branch("Downtown Rent-A-Car",
            "123 Main Street Los Angeles, CA 90012", "213-555-1234");
    Branch branch2 = new Branch("Lone Star Rentals",
            "456 Oak Avenue Austin, TX 78704", "512-555-4567");
    Branch branch3 = new Branch("Empire Car Rentals",
            "789 Broadway New York, NY 10010", "212-555-7890");

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
    private void createBranch() {
        branchRepository.save(branch1);
        branchRepository.save(branch2);
        branchRepository.save(branch3);
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

    private void createEmployee() {
        employeeRepository.save(new Employee("Max", "555-121-2121", "max@example.com",
                "EMP02567", Role.MANAGER, ShiftSchedule.MORNING_8_TO_4, branch1));
        employeeRepository.save(new Employee("Matt", "555-232-3232", "matt@example.com",
                "EMP02890", Role.CUSTOMER_SERVICE_AGENT, ShiftSchedule.MORNING_8_TO_4, branch1));
        employeeRepository.save(new Employee("Mae", "555-343-4343", "mae@example.com",
                "EMP00123", Role.VEHICLE_PREP_AGENT, ShiftSchedule.MORNING_8_TO_4, branch1));
        employeeRepository.save(new Employee("Mel", "555-454-5454", "mel@example.com",
                "EMP00456", Role.MANAGER, ShiftSchedule.MORNING_8_TO_4, branch2));
        employeeRepository.save(new Employee("Mark", "555-565-6565", "mark@example.com",
                "EMP00789", Role.VEHICLE_PREP_AGENT, ShiftSchedule.MORNING_8_TO_4, branch2));
        employeeRepository.save(new Employee("Mo", "555-676-7676", "mo@example.com",
                "EMP01012", Role.CUSTOMER_SERVICE_AGENT, ShiftSchedule.AFTERNOON_4_TO_12, branch2));
        employeeRepository.save(new Employee("Meg", "555-787-8787", "meg@example.com",
                "EMP01345", Role.ON_CALL_DRIVER, ShiftSchedule.MORNING_8_TO_4, branch2));
        employeeRepository.save(new Employee("Mitch", "555-898-9898", "mitch@example.com",
                "EMP01678", Role.MANAGER, ShiftSchedule.MORNING_8_TO_4, branch3));
        employeeRepository.save(new Employee("Mick", "555-909-0909", "mick@example.com",
                "EMP01901", Role.CUSTOMER_SERVICE_AGENT, ShiftSchedule.EVENING_12_TO_8, branch3));
        employeeRepository.save(new Employee("Miles", "555-101-0101", "miles@example.com",
                "EMP02234", Role.VEHICLE_PREP_AGENT, ShiftSchedule.MORNING_8_TO_4, branch3));
    }

    @Autowired
    VehicleConfig vehicleConfig;

    @Autowired
    VehicleRepository vehicleRepository;

    private void createVehicle() {
        List<Vehicle> vehicles = vehicleConfig.vehicles();
        vehicles.forEach(v -> vehicleRepository.save(v));
    }

    @Override
    public void run(String... args) throws Exception {
        createPerson();
        createBranch();
        createCustomer();
        createEmployee();

        createVehicle();
    }
}
