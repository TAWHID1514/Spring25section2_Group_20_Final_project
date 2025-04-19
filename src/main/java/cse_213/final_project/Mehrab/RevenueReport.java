package cse_213.final_project.Mehrab;

import javafx.beans.property.*;

import java.time.LocalDate;

public class RevenueReport {

    private final StringProperty vehicleType;
    private final IntegerProperty numVehicles;
    private final DoubleProperty totalRevenue;
    private final ObjectProperty<LocalDate> date;

    public RevenueReport(LocalDate date, String vehicleType, int numVehicles, double totalRevenue) {
        this.date = new SimpleObjectProperty<>(date);
        this.vehicleType = new SimpleStringProperty(vehicleType);
        this.numVehicles = new SimpleIntegerProperty(numVehicles);
        this.totalRevenue = new SimpleDoubleProperty(totalRevenue);
    }

    public LocalDate getDate() {
        return date.get();
    }

    public void setDate(LocalDate date) {
        this.date.set(date);
    }

    public ObjectProperty<LocalDate> dateProperty() {
        return date;
    }

    public String getVehicleType() {
        return vehicleType.get();
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType.set(vehicleType);
    }

    public StringProperty vehicleTypeProperty() {
        return vehicleType;
    }

    public int getNumVehicles() {
        return numVehicles.get();
    }

    public void setNumVehicles(int numVehicles) {
        this.numVehicles.set(numVehicles);
    }

    public IntegerProperty numVehiclesProperty() {
        return numVehicles;
    }

    public double getTotalRevenue() {
        return totalRevenue.get();
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue.set(totalRevenue);
    }

    public DoubleProperty totalRevenueProperty() {
        return totalRevenue;
    }
}

