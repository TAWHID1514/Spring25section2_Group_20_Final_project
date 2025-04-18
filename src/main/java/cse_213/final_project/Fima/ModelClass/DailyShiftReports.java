package cse_213.final_project.Fima.ModelClass;

public class DailyShiftReports {

    public int Boothid, VehicleCont;
    public String TollOperator;
    public String Describeissue;

    public DailyShiftReports(int boothid, int vehicleCont, String tollOperator, String describeissue) {
        Boothid = boothid;
        VehicleCont = vehicleCont;
        TollOperator = tollOperator;
        Describeissue = describeissue;
    }

    public int getBoothid() {
        return Boothid;
    }

    public void setBoothid(int boothid) {
        Boothid = boothid;
    }

    public int getVehicleCont() {
        return VehicleCont;
    }

    public void setVehicleCont(int vehicleCont) {
        VehicleCont = vehicleCont;
    }

    public String getTollOperator() {
        return TollOperator;
    }

    public void setTollOperator(String tollOperator) {
        TollOperator = tollOperator;
    }

    public String getDescribeissue() {
        return Describeissue;
    }

    public void setDescribeissue(String describeissue) {
        Describeissue = describeissue;
    }


    @Override
    public String toString() {
        return "DailyShiftReports{" +
                "Boothid=" + Boothid +
                ", VehicleCont=" + VehicleCont +
                ", TollOperator='" + TollOperator + '\'' +
                ", Describeissue='" + Describeissue + '\'' +
                '}';
    }
}
