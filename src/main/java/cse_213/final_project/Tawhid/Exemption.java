package cse_213.final_project.Tawhid;

import java.io.Serializable;
import java.time.LocalDate;

public class Exemption implements Serializable {
    private String vehicleType,licenceNo,regNo,reason;
    private LocalDate date;

    public Exemption(String vehicleType, String licenceNo, String regNo, String reason, LocalDate date) {
        this.vehicleType = vehicleType;
        this.licenceNo = licenceNo;
        this.regNo = regNo;
        this.reason = reason;
        this.date = date;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Exemption{" +
                "vehicleType='" + vehicleType + '\'' +
                ", licenceNo='" + licenceNo + '\'' +
                ", regNo='" + regNo + '\'' +
                ", reason='" + reason + '\'' +
                ", date=" + date +
                '}';
    }
}
