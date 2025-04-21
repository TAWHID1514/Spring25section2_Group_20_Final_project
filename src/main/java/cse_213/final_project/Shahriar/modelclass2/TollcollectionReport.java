package cse_213.final_project.Shahriar.modelclass2;

import java.time.LocalDate;

public class TollcollectionReport {
    private LocalDate date;
    private int vehiclePassed;
    private double TollCollect;

    public TollcollectionReport(LocalDate date, int vehiclePassed, double tollCollect) {
        this.date = date;
        this.vehiclePassed = vehiclePassed;
        TollCollect = tollCollect;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getVehiclePassed() {
        return vehiclePassed;
    }

    public void setVehiclePassed(int vehiclePassed) {
        this.vehiclePassed = vehiclePassed;
    }

    public double getTollCollect() {
        return TollCollect;
    }

    public void setTollCollect(double tollCollect) {
        TollCollect = tollCollect;
    }

    @Override
    public String toString() {
        return "TollcollectionReport{" +
                "date=" + date +
                ", vehiclePassed=" + vehiclePassed +
                ", TollCollect=" + TollCollect +
                '}';
    }
}
