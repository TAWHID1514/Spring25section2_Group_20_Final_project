package cse_213.final_project.Tawhid;

import java.util.Date;

public class Vehicle {
    private String registrationNo;
    private String vehicleType;
    private float tollAmount;
    private boolean isTollPaid;
    private boolean isFlagged;
    private boolean isFinePaid;
    private String reasonForFlag;
    private String driverLicenseNo;
    private Date dateOfViolation;
    private float fineAmount;
    private Date fineDueDate;

    public Vehicle(String registrationNo, String vehicleType, float tollAmount, boolean isTollPaid, boolean isFlagged, boolean isFinePaid, String reasonForFlag, String driverLicenseNo, Date dateOfViolation, float fineAmount, Date fineDueDate) {
        this.registrationNo = registrationNo;
        this.vehicleType = vehicleType;
        this.tollAmount = tollAmount;
        this.isTollPaid = isTollPaid;
        this.isFlagged = isFlagged;
        this.isFinePaid = isFinePaid;
        this.reasonForFlag = reasonForFlag;
        this.driverLicenseNo = driverLicenseNo;
        this.dateOfViolation = dateOfViolation;
        this.fineAmount = fineAmount;
        this.fineDueDate = fineDueDate;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public float getTollAmount() {
        return tollAmount;
    }

    public void setTollAmount(float tollAmount) {
        this.tollAmount = tollAmount;
    }

    public boolean isTollPaid() {
        return isTollPaid;
    }

    public void setTollPaid(boolean tollPaid) {
        isTollPaid = tollPaid;
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public void setFlagged(boolean flagged) {
        isFlagged = flagged;
    }

    public boolean isFinePaid() {
        return isFinePaid;
    }

    public void setFinePaid(boolean finePaid) {
        isFinePaid = finePaid;
    }

    public String getReasonForFlag() {
        return reasonForFlag;
    }

    public void setReasonForFlag(String reasonForFlag) {
        this.reasonForFlag = reasonForFlag;
    }

    public String getDriverLicenseNo() {
        return driverLicenseNo;
    }

    public void setDriverLicenseNo(String driverLicenseNo) {
        this.driverLicenseNo = driverLicenseNo;
    }

    public Date getDateOfViolation() {
        return dateOfViolation;
    }

    public void setDateOfViolation(Date dateOfViolation) {
        this.dateOfViolation = dateOfViolation;
    }

    public float getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(float fineAmount) {
        this.fineAmount = fineAmount;
    }

    public Date getFineDueDate() {
        return fineDueDate;
    }

    public void setFineDueDate(Date fineDueDate) {
        this.fineDueDate = fineDueDate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationNo='" + registrationNo + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", tollAmount=" + tollAmount +
                ", isTollPaid=" + isTollPaid +
                ", isFlagged=" + isFlagged +
                ", isFinePaid=" + isFinePaid +
                ", reasonForFlag='" + reasonForFlag + '\'' +
                ", driverLicenseNo='" + driverLicenseNo + '\'' +
                ", dateOfViolation=" + dateOfViolation +
                ", fineAmount=" + fineAmount +
                ", fineDueDate=" + fineDueDate +
                '}';
    }
}
