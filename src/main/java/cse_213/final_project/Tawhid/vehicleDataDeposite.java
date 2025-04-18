package cse_213.final_project.Tawhid;

public class vehicleDataDeposite {
    private String vehicleType;
    private int ratePerVehicle;
    private int numberOfVehicles;
    private int totalAmount;

    public vehicleDataDeposite(String vehicleType, int ratePerVehicle, int numberOfVehicles, int totalAmount) {
        this.vehicleType = vehicleType;
        this.ratePerVehicle = ratePerVehicle;
        this.numberOfVehicles = numberOfVehicles;
        this.totalAmount = totalAmount;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getRatePerVehicle() {
        return ratePerVehicle;
    }

    public void setRatePerVehicle(int ratePerVehicle) {
        this.ratePerVehicle = ratePerVehicle;
    }

    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "vehicleDataDeposite{" +
                "vehicleType='" + vehicleType + '\'' +
                ", ratePerVehicle=" + ratePerVehicle +
                ", numberOfVehicles=" + numberOfVehicles +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
