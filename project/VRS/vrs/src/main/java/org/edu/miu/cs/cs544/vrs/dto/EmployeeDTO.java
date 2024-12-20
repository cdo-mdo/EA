package org.edu.miu.cs.cs544.vrs.dto;

import org.edu.miu.cs.cs544.vrs.Entity.ShiftSchedule;

public class EmployeeDTO {
    private String name;
    private String employeeId;
    private String role;
    private ShiftSchedule shift;
    private String username;
    private String password;

    public EmployeeDTO() {

    }
    public EmployeeDTO(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getRole() {
        return role;
    }
    public ShiftSchedule getShift() {
        return shift;
    }
}
