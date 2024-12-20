package org.edu.miu.cs.cs544.vrs.dto;

import java.time.LocalDateTime;

public class ReservationDTO {
    private long vehicleId;
    private String customerName;
    private String email;
    private String phone;
    private LocalDateTime pickupDateTime;
    private LocalDateTime returnDateTime;

    public ReservationDTO() {

    }

    public long getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public LocalDateTime getPickupDateTime() {
        return pickupDateTime;
    }
    public void setPickupDateTime(LocalDateTime pickupDateTime) {
        this.pickupDateTime = pickupDateTime;
    }
    public LocalDateTime getReturnDateTime() {
        return returnDateTime;
    }
    public void setReturnDateTime(LocalDateTime returnDateTime) {
        this.returnDateTime = returnDateTime;
    }
}
