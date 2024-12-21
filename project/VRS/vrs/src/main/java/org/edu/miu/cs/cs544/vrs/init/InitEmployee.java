package org.edu.miu.cs.cs544.vrs.init;

import org.edu.miu.cs.cs544.vrs.Entity.*;
import org.edu.miu.cs.cs544.vrs.repository.BranchRepository;
import org.edu.miu.cs.cs544.vrs.repository.EmployeeRepository;
import org.edu.miu.cs.cs544.vrs.repository.RoleRepository;
import org.edu.miu.cs.cs544.vrs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class InitEmployee {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private BranchRepository branchRepository;

    public void initData() {
        Branch branch1 = branchRepository.findById(1L).get();
        Branch branch2 = branchRepository.findById(2L).get();
        Branch branch3 = branchRepository.findById(3L).get();

        Employee employee1 = new Employee("Max", "555-121-2121", "max@example.com",
                "EMP02567", roleRepository.findByName(RoleName.MANAGER).get(),
                ShiftSchedule.MORNING_8_TO_4, branch1);
        User user1 = new User("max", passwordEncoder.encode("123"),
                roleRepository.findByName(RoleName.MANAGER).get());
        employeeRepository.save(employee1);
        user1.setEmployee(employee1);
        userRepository.save(user1);

        Employee employee2 = new Employee("Matt", "555-232-3232", "matt@example.com",
                "EMP02890", roleRepository.findByName(RoleName.CUSTOMER_SERVICE_AGENT).get(),
                ShiftSchedule.MORNING_8_TO_4, branch1);
        User user2 = new User("matt", passwordEncoder.encode("123"),
                roleRepository.findByName(RoleName.CUSTOMER_SERVICE_AGENT).get());
        employeeRepository.save(employee2);
        user2.setEmployee(employee2);
        userRepository.save(user2);

        Employee employee3 = new Employee("Mae", "555-343-4343", "mae@example.com",
                "EMP00123", roleRepository.findByName(RoleName.VEHICLE_PREP_AGENT).get(),
                ShiftSchedule.MORNING_8_TO_4, branch1);
        User user3 = new User("mae", passwordEncoder.encode("123"),
                roleRepository.findByName(RoleName.VEHICLE_PREP_AGENT).get());
        employeeRepository.save(employee3);
        user3.setEmployee(employee3);
        userRepository.save(user3);

        Employee employee4 = new Employee("Mel", "555-454-5454", "mel@example.com",
                "EMP00456", roleRepository.findByName(RoleName.MANAGER).get(),
                ShiftSchedule.MORNING_8_TO_4, branch1);
        User user4 = new User("mel", passwordEncoder.encode("123"),
                roleRepository.findByName(RoleName.MANAGER).get());
        employeeRepository.save(employee4);
        user4.setEmployee(employee4);
        userRepository.save(user4);

        Employee employee5 = new Employee("Mark", "555-565-6565", "mark@example.com",
                "EMP00789", roleRepository.findByName(RoleName.VEHICLE_PREP_AGENT).get(),
                ShiftSchedule.MORNING_8_TO_4, branch2);
        User user5 = new User("mark", passwordEncoder.encode("123"),
                roleRepository.findByName(RoleName.VEHICLE_PREP_AGENT).get());
        employeeRepository.save(employee5);
        user5.setEmployee(employee5);
        userRepository.save(user5);

        Employee employee6 = new Employee("Mo", "555-676-7676", "mo@example.com",
                "EMP01012", roleRepository.findByName(RoleName.CUSTOMER_SERVICE_AGENT).get(),
                ShiftSchedule.AFTERNOON_4_TO_12, branch2);
        User user6 = new User("mo", passwordEncoder.encode("123"),
                roleRepository.findByName(RoleName.CUSTOMER_SERVICE_AGENT).get());
        employeeRepository.save(employee6);
        user6.setEmployee(employee6);
        userRepository.save(user6);

        Employee employee7 = new Employee("Meg", "555-787-8787", "meg@example.com",
                "EMP01345", roleRepository.findByName(RoleName.ON_CALL_DRIVER).get(),
                ShiftSchedule.MORNING_8_TO_4, branch2);
        employeeRepository.save(employee7);
        user1.setEmployee(employee7);

        Employee employee8 = new Employee("Mitch", "555-898-9898", "mitch@example.com",
                "EMP01678", roleRepository.findByName(RoleName.MANAGER).get(),
                ShiftSchedule.MORNING_8_TO_4, branch3);
        User user8 = new User("mitch", passwordEncoder.encode("123"),
                roleRepository.findByName(RoleName.MANAGER).get());
        employeeRepository.save(employee8);
        user8.setEmployee(employee8);
        userRepository.save(user8);

        Employee employee9 = new Employee("Mick", "555-909-0909", "mick@example.com",
                "EMP01901", roleRepository.findByName(RoleName.CUSTOMER_SERVICE_AGENT).get(),
                ShiftSchedule.EVENING_12_TO_8, branch3);
        User user9 = new User("mick", passwordEncoder.encode("123"),
                roleRepository.findByName(RoleName.CUSTOMER_SERVICE_AGENT).get());
        employeeRepository.save(employee9);
        user9.setEmployee(employee9);
        userRepository.save(user9);

        Employee employee10 = new Employee("Miles", "555-101-0101", "miles@example.com",
                "EMP02234", roleRepository.findByName(RoleName.VEHICLE_PREP_AGENT).get(),
                ShiftSchedule.MORNING_8_TO_4, branch3);
        User user10 = new User("miles", passwordEncoder.encode("123"),
                roleRepository.findByName(RoleName.VEHICLE_PREP_AGENT).get());
        employeeRepository.save(employee10);
        user10.setEmployee(employee10);
        userRepository.save(user10);

    }
}
