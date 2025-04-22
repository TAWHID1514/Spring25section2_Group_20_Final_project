package cse_213.final_project.Tawhid;

import java.util.Date;

public class DailyReport {
    private Date reportDate;
    private String vehicleType;
    private int numberOfVehicles;
    private float totalToll;

    public DailyReport(Date reportDate, String vehicleType, int numberOfVehicles, float totalToll) {
        this.reportDate = reportDate;
        this.vehicleType = vehicleType;
        this.numberOfVehicles = numberOfVehicles;
        this.totalToll = totalToll;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    public float getTotalToll() {
        return totalToll;
    }

    public void setTotalToll(float totalToll) {
        this.totalToll = totalToll;
    }

    @Override
    public String toString() {
        return "DailyReport{" +
                "reportDate=" + reportDate +
                ", vehicleType='" + vehicleType + '\'' +
                ", numberOfVehicles=" + numberOfVehicles +
                ", totalToll=" + totalToll +
                '}';
    }
}
