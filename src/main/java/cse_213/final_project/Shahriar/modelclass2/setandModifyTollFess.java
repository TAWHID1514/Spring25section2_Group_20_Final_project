package cse_213.final_project.Shahriar.modelclass2;

import java.time.LocalDate;

public class setandModifyTollFess {
    private String vehiclesType;
    private String tollAmount;
    private LocalDate date;

    public setandModifyTollFess(String vehiclesType, String tollAmount, LocalDate date) {
        this.vehiclesType = vehiclesType;
        this.tollAmount = tollAmount;
        this.date = date;
    }

    public String getVehiclesType() {
        return vehiclesType;
    }

    public void setVehiclesType(String vehiclesType) {
        this.vehiclesType = vehiclesType;
    }

    public String getTollAmount() {
        return tollAmount;
    }

    public void setTollAmount(String tollAmount) {
        this.tollAmount = tollAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "setandModifyTollFess{" +
                "vehiclesType='" + vehiclesType + '\'' +
                ", tollAmount='" + tollAmount + '\'' +
                ", date=" + date +
                '}';
    }
}
