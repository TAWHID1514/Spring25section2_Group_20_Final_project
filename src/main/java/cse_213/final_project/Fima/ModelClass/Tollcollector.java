package cse_213.final_project.Fima.ModelClass;

import java.time.LocalDate;

public class Tollcollector {

    public String vehicletype;
    public int regnum;
    public float amount;
    public LocalDate date;

    public Tollcollector(String vehicletype, int regnum, float amount, LocalDate date) {
        this.vehicletype = vehicletype;
        this.regnum = regnum;
        this.amount = amount;
        this.date = date;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public int getRegnum() {
        return regnum;
    }

    public void setRegnum(int regnum) {
        this.regnum = regnum;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Tollcollector{" +
                "vehicletype='" + vehicletype + '\'' +
                ", regnum=" + regnum +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
