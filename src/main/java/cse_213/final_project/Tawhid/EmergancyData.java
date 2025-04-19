package cse_213.final_project.Tawhid;

import java.io.Serializable;

public class EmergancyData implements Serializable {
    private String lane;
    private String reason;
    private String registrationNo;

    public EmergancyData(String lane, String reason, String registrationNo) {
        this.lane = lane;
        this.reason = reason;
        this.registrationNo = registrationNo;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    @Override
    public String toString() {
        return "Data{" +
                "lane='" + lane + '\'' +
                ", reason='" + reason + '\'' +
                ", registrationNo='" + registrationNo + '\'' +
                '}';
    }
}
