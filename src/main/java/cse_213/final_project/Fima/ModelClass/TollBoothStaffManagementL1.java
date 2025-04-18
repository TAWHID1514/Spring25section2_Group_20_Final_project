package cse_213.final_project.Fima.ModelClass;

public class TollBoothStaffManagementL1 {

    public String staffname,sendingdepertment;
    public int staffid;


    public TollBoothStaffManagementL1(String staffname, String sendingdepertment, int staffid) {
        this.staffname = staffname;
        this.sendingdepertment = sendingdepertment;
        this.staffid = staffid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getSendingdepertment() {
        return sendingdepertment;
    }

    public void setSendingdepertment(String sendingdepertment) {
        this.sendingdepertment = sendingdepertment;
    }

    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    @Override
    public String toString() {
        return "TollBoothStaffManagementL1{" +
                "staffname='" + staffname + '\'' +
                ", sendingdepertment='" + sendingdepertment + '\'' +
                ", staffid=" + staffid +
                '}';
    }
}
