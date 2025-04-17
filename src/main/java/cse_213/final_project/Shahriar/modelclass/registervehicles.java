package cse_213.final_project.Shahriar.modelclass;

public class    registervehicles {
    private String licensePlate;
    private String vehicleType;

    public registervehicles(String licensePlate, String vehicleType, String registrationDocsPath) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.registrationDocsPath = registrationDocsPath;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRegistrationDocsPath() {
        return registrationDocsPath;
    }

    public void setRegistrationDocsPath(String registrationDocsPath) {
        this.registrationDocsPath = registrationDocsPath;
    }

    @Override
    public String toString() {
        return "registervehicles{" +
                "licensePlate='" + licensePlate + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", registrationDocsPath='" + registrationDocsPath + '\'' +
                '}';
    }

    private String registrationDocsPath;

}
