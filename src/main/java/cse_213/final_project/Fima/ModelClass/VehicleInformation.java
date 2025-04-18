package cse_213.final_project.Fima.ModelClass;

import java.time.LocalDate;

public class VehicleInformation {

    public String vehicletype,regestration,ownername;
    public int regnum;
    public float vehicletoll;
    public LocalDate date;


    public VehicleInformation(String vehicletype, String regestration, String ownername, int regnum, float vehicletoll, LocalDate date) {
        this.vehicletype = vehicletype;
        this.regestration = regestration;
        this.ownername = ownername;
        this.regnum = regnum;
        this.vehicletoll = vehicletoll;
        this.date = date;
    }


    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getRegestration() {
        return regestration;
    }

    public void setRegestration(String regestration) {
        this.regestration = regestration;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public int getRegnum() {
        return regnum;
    }

    public void setRegnum(int regnum) {
        this.regnum = regnum;
    }

    public float getVehicletoll() {
        return vehicletoll;
    }

    public void setVehicletoll(float vehicletoll) {
        this.vehicletoll = vehicletoll;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "VehicleInformation{" +
                "vehicletype='" + vehicletype + '\'' +
                ", regestration='" + regestration + '\'' +
                ", ownername='" + ownername + '\'' +
                ", regnum=" + regnum +
                ", vehicletoll=" + vehicletoll +
                ", date=" + date +
                '}';
    }
}
