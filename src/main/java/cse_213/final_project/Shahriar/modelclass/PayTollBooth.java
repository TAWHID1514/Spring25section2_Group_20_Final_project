package cse_213.final_project.Shahriar.modelclass;

public class PayTollBooth {
    private String tagId;
    private String vehicleType;
    private double tollAmount;
    private boolean paid;

    public PayTollBooth(String tagId, String vehicleType, double tollAmount, boolean paid) {
        this.tagId = tagId;
        this.vehicleType = vehicleType;
        this.tollAmount = tollAmount;
        this.paid = paid;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getTollAmount() {
        return tollAmount;
    }

    public void setTollAmount(double tollAmount) {
        this.tollAmount = tollAmount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "PayTollBooth{" +
                "tagId='" + tagId + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", tollAmount=" + tollAmount +
                ", paid=" + paid +
                '}';
    }
}
