package cse_213.final_project.Fima.ModelClass;

public class SystemFailures {

    public String issuetype,device,Priority;
    public int boothnumber;


    public SystemFailures(String issuetype, String device, String priority, int boothnumber) {
        this.issuetype = issuetype;
        this.device = device;
        Priority = priority;
        this.boothnumber = boothnumber;
    }

    public String getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(String issuetype) {
        this.issuetype = issuetype;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }

    public int getBoothnumber() {
        return boothnumber;
    }

    public void setBoothnumber(int boothnumber) {
        this.boothnumber = boothnumber;
    }


    @Override
    public String toString() {
        return "SystemFailures{" +
                "issuetype='" + issuetype + '\'' +
                ", device='" + device + '\'' +
                ", Priority='" + Priority + '\'' +
                ", boothnumber=" + boothnumber +
                '}';
    }
}
