package cse_213.final_project;

public class VehicleOwner {
    String name,phoneNo,email,vehicleRegNo;
    int licenceNo;

    public VehicleOwner(String name, String phoneNo, String email, String vehicleRegNo, int licenceNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.vehicleRegNo = vehicleRegNo;
        this.licenceNo = licenceNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVehicleRegNo() {
        return vehicleRegNo;
    }

    public void setVehicleRegNo(String vehicleRegNo) {
        this.vehicleRegNo = vehicleRegNo;
    }

    public int getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(int licenceNo) {
        this.licenceNo = licenceNo;
    }

    @Override
    public String toString() {
        return "VehicleOwner{" +
                "name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                ", vehicleRegNo='" + vehicleRegNo + '\'' +
                ", licenceNo=" + licenceNo +
                '}';
    }
}
