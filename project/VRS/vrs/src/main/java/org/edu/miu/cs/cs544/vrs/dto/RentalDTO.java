package org.edu.miu.cs.cs544.vrs.dto;

import java.time.LocalDateTime;

public class RentalDTO {
    private Long vehicleId;
    private Long reservationId;
    private String customerName;
    private String phone;
    private String email;
    private String driverLicenseNumber;
    private LocalDateTime pickupDate;
    private LocalDateTime returnDate;

    public RentalDTO() {

    }
    public Long getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
    public Long getReservationId() {
        return reservationId;
    }
    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }
    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }
    public LocalDateTime getPickupDate() {
        return pickupDate;
    }
    public void setPickupDate(LocalDateTime pickupDate) {
        this.pickupDate = pickupDate;
    }
    public LocalDateTime getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

}
