package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee extends Person {
    private String role;
    private String shiftSchedule;

    @ManyToOne
    private Branch branch;
}
