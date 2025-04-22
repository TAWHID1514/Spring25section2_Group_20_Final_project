package cse_213.final_project.Shahriar.modelclass2;

import java.util.List;

public class vehiclesOwnerdashboard {
    private String ownerId;
    private String ownerName;
    private double etagBalance;
    private List<Vehicle> registeredVehicles;
    private List<TollHistory> tollHistory;

    public vehiclesOwnerdashboard(String ownerId, String ownerName, double etagBalance, List<Vehicle> registeredVehicles, List<TollHistory> tollHistory) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.etagBalance = etagBalance;
        this.registeredVehicles = registeredVehicles;
        this.tollHistory = tollHistory;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getEtagBalance() {
        return etagBalance;
    }

    public void setEtagBalance(double etagBalance) {
        this.etagBalance = etagBalance;
    }

    public List<Vehicle> getRegisteredVehicles() {
        return registeredVehicles;
    }

    public void setRegisteredVehicles(List<Vehicle> registeredVehicles) {
        this.registeredVehicles = registeredVehicles;
    }

    public List<TollHistory> getTollHistory() {
        return tollHistory;
    }

    public void setTollHistory(List<TollHistory> tollHistory) {
        this.tollHistory = tollHistory;
    }

    @Override
    public String toString() {
        return "vehiclesOwnerdashboard{" +
                "ownerId='" + ownerId + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", etagBalance=" + etagBalance +
                ", registeredVehicles=" + registeredVehicles +
                ", tollHistory=" + tollHistory +
                '}';
    }
}
