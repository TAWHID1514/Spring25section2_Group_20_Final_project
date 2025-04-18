package cse_213.final_project.Fima.ModelClass;

public class InformationSupport {

    public String vehicletype;
    public int Wheel;


    public InformationSupport(String vehicletype, int wheel) {
        this.vehicletype = vehicletype;
        Wheel = wheel;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public int getWheel() {
        return Wheel;
    }

    public void setWheel(int wheel) {
        Wheel = wheel;
    }

    @Override
    public String toString() {
        return "InformationSupport{" +
                "vehicletype='" + vehicletype + '\'' +
                ", Wheel=" + Wheel +
                '}';
    }
}
