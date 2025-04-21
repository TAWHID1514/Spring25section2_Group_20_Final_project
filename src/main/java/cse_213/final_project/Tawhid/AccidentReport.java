package cse_213.final_project.Tawhid;

import java.util.Date;

public class AccidentReport {
    private String location;
    private String vehicleRegNo;
    private String driverLicenseNo;
    private String cause;
    private Date date;

    public AccidentReport(String location, String vehicleRegNo, String driverLicenseNo, String cause, Date date) {
        this.location = location;
        this.vehicleRegNo = vehicleRegNo;
        this.driverLicenseNo = driverLicenseNo;
        this.cause = cause;
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVehicleRegNo() {
        return vehicleRegNo;
    }

    public void setVehicleRegNo(String vehicleRegNo) {
        this.vehicleRegNo = vehicleRegNo;
    }

    public String getDriverLicenseNo() {
        return driverLicenseNo;
    }

    public void setDriverLicenseNo(String driverLicenseNo) {
        this.driverLicenseNo = driverLicenseNo;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AccidentReport{" +
                "location='" + location + '\'' +
                ", vehicleRegNo='" + vehicleRegNo + '\'' +
                ", driverLicenseNo='" + driverLicenseNo + '\'' +
                ", cause='" + cause + '\'' +
                ", date=" + date +
                '}';
    }
}
