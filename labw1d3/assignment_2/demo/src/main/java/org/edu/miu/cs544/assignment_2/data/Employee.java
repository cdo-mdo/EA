package org.edu.miu.cs544.assignment_2.data;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Employee extends Person {
    private String role;

    @ManyToOne
    private Branch branch;

    @OneToMany(mappedBy = "employee")
    private List<ShiftAssignment> shiftAssignments;
}
