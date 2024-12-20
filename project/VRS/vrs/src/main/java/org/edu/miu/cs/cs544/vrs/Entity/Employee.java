package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.*;

@Entity
public class Employee extends Person {
    private String employeeId;
    private ShiftSchedule shiftSchedule;

    @ManyToOne
    @JoinColumn(name = "branch_id", nullable = true)
    private Branch branch;

    @OneToOne
    @JoinColumn(name="role_id", nullable = false)
    private Role role;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    private User user;

    public Employee() {
        super();
    }

    public Employee(String name, String mobileNumber, String email,
                    String employeeId, Role role, ShiftSchedule shiftSchedule, Branch branch) {
        super(name, mobileNumber, email);
        this.employeeId = employeeId;
        this.role = role;
        this.shiftSchedule = shiftSchedule;
        this.branch = branch;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public Role getRole() {
        return this.role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public ShiftSchedule getShiftSchedule() {
        return this.shiftSchedule;
    }
    public void setShiftSchedule(ShiftSchedule shiftSchedule) {
        this.shiftSchedule = shiftSchedule;
    }
    public Branch getBranch() {
        return this.branch;
    }
    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
