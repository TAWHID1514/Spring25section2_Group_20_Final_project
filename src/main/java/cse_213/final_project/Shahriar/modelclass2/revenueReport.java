package cse_213.final_project.Shahriar.modelclass2;

import java.time.LocalDate;

public class revenueReport {
    private String vehiclesType;
    private int vehiclesCount;
    private double AmountCollect;
    private LocalDate date;

    public revenueReport(String vehiclesType, int vehiclesCount, double amountCollect, LocalDate date) {
        this.vehiclesType = vehiclesType;
        this.vehiclesCount = vehiclesCount;
        AmountCollect = amountCollect;
        this.date = date;
    }

    public String getVehiclesType() {
        return vehiclesType;
    }

    public void setVehiclesType(String vehiclesType) {
        this.vehiclesType = vehiclesType;
    }

    public int getVehiclesCount() {
        return vehiclesCount;
    }

    public void setVehiclesCount(int vehiclesCount) {
        this.vehiclesCount = vehiclesCount;
    }

    public double getAmountCollect() {
        return AmountCollect;
    }

    public void setAmountCollect(double amountCollect) {
        AmountCollect = amountCollect;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "revenueReport{" +
                "vehiclesType='" + vehiclesType + '\'' +
                ", vehiclesCount=" + vehiclesCount +
                ", AmountCollect=" + AmountCollect +
                ", date=" + date +
                '}';
    }
}
