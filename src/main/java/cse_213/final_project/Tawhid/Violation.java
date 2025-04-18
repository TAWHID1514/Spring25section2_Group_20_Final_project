package cse_213.final_project.Tawhid;

import java.io.Serializable;
import java.time.LocalDate;

public class Violation implements Serializable {
    private String vehicleType;
    private String registrationNo;
    private String licenceNo;
    private String status;
    private LocalDate date;
    private String amount;

    public Violation(String vehicleType, String registrationNo, String licenceNo, String status, LocalDate date, String amount) {
        this.vehicleType = vehicleType;
        this.registrationNo = registrationNo;
        this.licenceNo = licenceNo;
        this.status = status;
        this.date = date;
        this.amount = amount;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
