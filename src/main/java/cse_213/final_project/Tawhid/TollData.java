package cse_213.final_project.Tawhid;

import javafx.beans.binding.BooleanExpression;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

import java.io.Serializable;
import java.time.LocalDate;

public class TollData implements Serializable {
    private  String vehicleType;
    private  float ratePerVehicle;
    private float amount;
    private String date;

    public TollData(String vehicleType, float ratePerVehicle, float amount, String date) {
        this.vehicleType = vehicleType;
        this.ratePerVehicle = ratePerVehicle;
        this.amount = amount;
        this.date = date;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public float getRatePerVehicle() {
        return ratePerVehicle;
    }

    public void setRatePerVehicle(float ratePerVehicle) {
        this.ratePerVehicle = ratePerVehicle;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TollData{" +
                "vehicleType='" + vehicleType + '\'' +
                ", ratePerVehicle=" + ratePerVehicle +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}