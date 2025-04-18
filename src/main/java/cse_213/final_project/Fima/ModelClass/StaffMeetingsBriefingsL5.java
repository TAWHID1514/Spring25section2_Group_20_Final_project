package cse_213.final_project.Fima.ModelClass;

import java.time.LocalDate;

public class StaffMeetingsBriefingsL5 {

    private String meetingtype,meetinginfo,staffattendees;
    private float meetingtime;
    private LocalDate meetingdate;

    public StaffMeetingsBriefingsL5(String meetingtype, String meetinginfo, String staffattendees, float meetingtime, LocalDate meetingdate) {
        this.meetingtype = meetingtype;
        this.meetinginfo = meetinginfo;
        this.staffattendees = staffattendees;
        this.meetingtime = meetingtime;
        this.meetingdate = meetingdate;
    }


    public String getMeetingtype() {
        return meetingtype;
    }

    public void setMeetingtype(String meetingtype) {
        this.meetingtype = meetingtype;
    }

    public String getMeetinginfo() {
        return meetinginfo;
    }

    public void setMeetinginfo(String meetinginfo) {
        this.meetinginfo = meetinginfo;
    }

    public String getStaffattendees() {
        return staffattendees;
    }

    public void setStaffattendees(String staffattendees) {
        this.staffattendees = staffattendees;
    }

    public float getMeetingtime() {
        return meetingtime;
    }

    public void setMeetingtime(float meetingtime) {
        this.meetingtime = meetingtime;
    }

    public LocalDate getMeetingdate() {
        return meetingdate;
    }

    public void setMeetingdate(LocalDate meetingdate) {
        this.meetingdate = meetingdate;
    }


    @Override
    public String toString() {
        return "StaffMeetingsBriefingsL5{" +
                "meetingtype='" + meetingtype + '\'' +
                ", meetinginfo='" + meetinginfo + '\'' +
                ", staffattendees='" + staffattendees + '\'' +
                ", meetingtime=" + meetingtime +
                ", meetingdate=" + meetingdate +
                '}';
    }
}
