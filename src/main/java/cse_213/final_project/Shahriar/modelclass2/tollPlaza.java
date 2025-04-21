package cse_213.final_project.Shahriar.modelclass2;

import java.util.List;

public class tollPlaza {
    private String adminId;
    private String adminName;

    // Latest toll fee settings
    private List<TollFee> tollFees;

    // Summary stats
    private double totalRevenue;
    private int totalVehiclesToday;

    public tollPlaza(String adminId, String adminName, List<TollFee> tollFees, double totalRevenue, int totalVehiclesToday) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.tollFees = tollFees;
        this.totalRevenue = totalRevenue;
        this.totalVehiclesToday = totalVehiclesToday;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public List<TollFee> getTollFees() {
        return tollFees;
    }

    public void setTollFees(List<TollFee> tollFees) {
        this.tollFees = tollFees;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public int getTotalVehiclesToday() {
        return totalVehiclesToday;
    }

    public void setTotalVehiclesToday(int totalVehiclesToday) {
        this.totalVehiclesToday = totalVehiclesToday;
    }

    @Override
    public String toString() {
        return "tollPlaza{" +
                "adminId='" + adminId + '\'' +
                ", adminName='" + adminName + '\'' +
                ", tollFees=" + tollFees +
                ", totalRevenue=" + totalRevenue +
                ", totalVehiclesToday=" + totalVehiclesToday +
                '}';
    }
}
