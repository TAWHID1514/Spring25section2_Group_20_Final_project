package cse_213.final_project.Fima.ModelClass;

public class PaymentRetry {

    public String issuetype,vehicletype,boothoperatorname;
    public int regnum,tollboothnumber;

    public PaymentRetry(String issuetype, String vehicletype, String boothoperatorname, int regnum, int tollboothnumber) {
        this.issuetype = issuetype;
        this.vehicletype = vehicletype;
        this.boothoperatorname = boothoperatorname;
        this.regnum = regnum;
        this.tollboothnumber = tollboothnumber;
    }


    public String getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(String issuetype) {
        this.issuetype = issuetype;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getBoothoperatorname() {
        return boothoperatorname;
    }

    public void setBoothoperatorname(String boothoperatorname) {
        this.boothoperatorname = boothoperatorname;
    }

    public int getRegnum() {
        return regnum;
    }

    public void setRegnum(int regnum) {
        this.regnum = regnum;
    }

    public int getTollboothnumber() {
        return tollboothnumber;
    }

    public void setTollboothnumber(int tollboothnumber) {
        this.tollboothnumber = tollboothnumber;
    }


    @Override
    public String toString() {
        return "PaymentRetry{" +
                "issuetype='" + issuetype + '\'' +
                ", vehicletype='" + vehicletype + '\'' +
                ", boothoperatorname='" + boothoperatorname + '\'' +
                ", regnum=" + regnum +
                ", tollboothnumber=" + tollboothnumber +
                '}';
    }
}
