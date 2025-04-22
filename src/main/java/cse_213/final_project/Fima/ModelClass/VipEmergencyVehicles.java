package cse_213.final_project.Fima.ModelClass;

public class VipEmergencyVehicles {

    public String PriorityPassage,vehicletype,vehiclemodel;
    public int regnum;

    public VipEmergencyVehicles(String priorityPassage, String vehicletype, String vehiclemodel, int regnum) {
        PriorityPassage = priorityPassage;
        this.vehicletype = vehicletype;
        this.vehiclemodel = vehiclemodel;
        this.regnum = regnum;
    }

    public String getPriorityPassage() {
        return PriorityPassage;
    }

    public void setPriorityPassage(String priorityPassage) {
        PriorityPassage = priorityPassage;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getVehiclemodel() {
        return vehiclemodel;
    }

    public void setVehiclemodel(String vehiclemodel) {
        this.vehiclemodel = vehiclemodel;
    }

    public int getRegnum() {
        return regnum;
    }

    public void setRegnum(int regnum) {
        this.regnum = regnum;
    }

    @Override
    public String toString() {
        return "VipEmergencyVehicles{" +
                "PriorityPassage='" + PriorityPassage + '\'' +
                ", vehicletype='" + vehicletype + '\'' +
                ", vehiclemodel='" + vehiclemodel + '\'' +
                ", regnum=" + regnum +
                '}';
    }
}
