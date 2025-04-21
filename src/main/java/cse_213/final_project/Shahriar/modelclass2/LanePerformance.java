package cse_213.final_project.Shahriar.modelclass2;

import java.time.LocalDateTime;

public class LanePerformance {
    private String selectLane;
    private LocalDateTime Date;
    private int vehiclesPassed;
    private double averageTime;
    private String LabelStatus;

    public LanePerformance(String selectLane, LocalDateTime date, int vehiclesPassed, double averageTime, String labelStatus) {
        this.selectLane = selectLane;
        Date = date;
        this.vehiclesPassed = vehiclesPassed;
        this.averageTime = averageTime;
        LabelStatus = labelStatus;
    }

    public String getSelectLane() {
        return selectLane;
    }

    public void setSelectLane(String selectLane) {
        this.selectLane = selectLane;
    }

    public LocalDateTime getDate() {
        return Date;
    }

    public void setDate(LocalDateTime date) {
        Date = date;
    }

    public int getVehiclesPassed() {
        return vehiclesPassed;
    }

    public void setVehiclesPassed(int vehiclesPassed) {
        this.vehiclesPassed = vehiclesPassed;
    }

    public double getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(double averageTime) {
        this.averageTime = averageTime;
    }

    public String getLabelStatus() {
        return LabelStatus;
    }

    public void setLabelStatus(String labelStatus) {
        LabelStatus = labelStatus;
    }

    @Override
    public String toString() {
        return "LanePerformance{" +
                "selectLane='" + selectLane + '\'' +
                ", Date=" + Date +
                ", vehiclesPassed=" + vehiclesPassed +
                ", averageTime=" + averageTime +
                ", LabelStatus='" + LabelStatus + '\'' +
                '}';
    }
}
