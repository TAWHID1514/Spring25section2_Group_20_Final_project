package cse_213.final_project.Fima.ModelClass;

import java.time.LocalDate;

public class IncidentReportsPlazaL6 {
    public LocalDate  Reportdate;
    public int boothnumber;
    public String incidentdetails;
    public int reporttime;


    public IncidentReportsPlazaL6(LocalDate reportdate, int boothnumber, String incidentdetails, int reporttime) {
        Reportdate = reportdate;
        this.boothnumber = boothnumber;
        this.incidentdetails = incidentdetails;
        this.reporttime = reporttime;
    }


    public LocalDate getReportdate() {
        return Reportdate;
    }

    public void setReportdate(LocalDate reportdate) {
        Reportdate = reportdate;
    }

    public int getBoothnumber() {
        return boothnumber;
    }

    public void setBoothnumber(int boothnumber) {
        this.boothnumber = boothnumber;
    }

    public String getIncidentdetails() {
        return incidentdetails;
    }

    public void setIncidentdetails(String incidentdetails) {
        this.incidentdetails = incidentdetails;
    }

    public int getReporttime() {
        return reporttime;
    }

    public void setReporttime(int reporttime) {
        this.reporttime = reporttime;
    }

    @Override
    public String toString() {
        return "IncidentReportsPlazaL6{" +
                "Reportdate=" + Reportdate +
                ", boothnumber=" + boothnumber +
                ", incidentdetails='" + incidentdetails + '\'' +
                ", reporttime=" + reporttime +
                '}';
    }
}
