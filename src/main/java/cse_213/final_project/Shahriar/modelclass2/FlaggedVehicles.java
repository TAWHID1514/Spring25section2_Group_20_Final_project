package cse_213.final_project.Shahriar.modelclass2;

import java.time.LocalDate;

public class FlaggedVehicles {
    private String vehicleNo;
    private String reason;
    private String flaggedBy;
    private double fine;
    private LocalDate date;
    private String status;

    public FlaggedVehicles(String vehicleNo, String reason, String flaggedBy, double fine, LocalDate date, String status) {
        this.vehicleNo = vehicleNo;
        this.reason = reason;
        this.flaggedBy = flaggedBy;
        this.fine = fine;
        this.date = date;
        this.status = status;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getFlaggedBy() {
        return flaggedBy;
    }

    public void setFlaggedBy(String flaggedBy) {
        this.flaggedBy = flaggedBy;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FlaggedVehicles{" +
                "vehicleNo='" + vehicleNo + '\'' +
                ", reason='" + reason + '\'' +
                ", flaggedBy='" + flaggedBy + '\'' +
                ", fine=" + fine +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
