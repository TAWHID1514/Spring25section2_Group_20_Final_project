package cse_213.final_project.Tawhid;

import java.util.Date;

public class fine {
    private String vehicleRegNo;
    private float fineAmount;
    private String reason;
    private Date dueDate;
    private boolean isPaid;

    public fine(String vehicleRegNo, float fineAmount, String reason, Date dueDate, boolean isPaid) {
        this.vehicleRegNo = vehicleRegNo;
        this.fineAmount = fineAmount;
        this.reason = reason;
        this.dueDate = dueDate;
        this.isPaid = isPaid;
    }

    public String getVehicleRegNo() {
        return vehicleRegNo;
    }

    public void setVehicleRegNo(String vehicleRegNo) {
        this.vehicleRegNo = vehicleRegNo;
    }

    public float getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(float fineAmount) {
        this.fineAmount = fineAmount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    @Override
    public String toString() {
        return "fine{" +
                "vehicleRegNo='" + vehicleRegNo + '\'' +
                ", fineAmount=" + fineAmount +
                ", reason='" + reason + '\'' +
                ", dueDate=" + dueDate +
                ", isPaid=" + isPaid +
                '}';
    }
}
