package cse_213.final_project.Shahriar.modelclass;

import java.time.LocalDate;

public class viewTollPaymenthistory {
    private String Name;
    private String vehiclesid;
    private LocalDate date;
    private String Amount;

    public viewTollPaymenthistory(String name, String vehiclesid, LocalDate date, String amount) {
        Name = name;
        this.vehiclesid = vehiclesid;
        this.date = date;
        Amount = amount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getVehiclesid() {
        return vehiclesid;
    }

    public void setVehiclesid(String vehiclesid) {
        this.vehiclesid = vehiclesid;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    @Override
    public String toString() {
        return "viewTollPaymenthistory{" +
                "Name='" + Name + '\'' +
                ", vehiclesid='" + vehiclesid + '\'' +
                ", date=" + date +
                ", Amount='" + Amount + '\'' +
                '}';
    }
}
