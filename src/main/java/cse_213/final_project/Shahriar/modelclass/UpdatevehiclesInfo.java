package cse_213.final_project.Shahriar.modelclass;

public class UpdatevehiclesInfo {
    private String vehiclesId;
    private String licensePlateNum;
    private String vehiclesType;

    public UpdatevehiclesInfo(String vehiclesId, String licensePlateNum, String vehiclesType) {
        this.vehiclesId = vehiclesId;
        this.licensePlateNum = licensePlateNum;
        this.vehiclesType = vehiclesType;
    }

    public String getVehiclesId() {
        return vehiclesId;
    }

    public void setVehiclesId(String vehiclesId) {
        this.vehiclesId = vehiclesId;
    }

    public String getLicensePlateNum() {
        return licensePlateNum;
    }

    public void setLicensePlateNum(String licensePlateNum) {
        this.licensePlateNum = licensePlateNum;
    }

    public String getVehiclesType() {
        return vehiclesType;
    }

    public void setVehiclesType(String vehiclesType) {
        this.vehiclesType = vehiclesType;
    }

    @Override
    public String toString() {
        return "UpdatevehiclesInfo{" +
                "vehiclesId='" + vehiclesId + '\'' +
                ", licensePlateNum='" + licensePlateNum + '\'' +
                ", vehiclesType='" + vehiclesType + '\'' +
                '}';
    }
}
