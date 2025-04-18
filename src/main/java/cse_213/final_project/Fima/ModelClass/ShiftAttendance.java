package cse_213.final_project.Fima.ModelClass;

import java.time.LocalDate;

public class ShiftAttendance {
    private String operatorname,Shift;
    private int tollboothnumber,id;
    private LocalDate date;
    private float starttime,endtime;


    public ShiftAttendance(String operatorname, String shift, int tollboothnumber, int id, LocalDate date, float starttime, float endtime) {
        this.operatorname = operatorname;
        Shift = shift;
        this.tollboothnumber = tollboothnumber;
        this.id = id;
        this.date = date;
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    public String getShift() {
        return Shift;
    }

    public void setShift(String shift) {
        Shift = shift;
    }

    public int getTollboothnumber() {
        return tollboothnumber;
    }

    public void setTollboothnumber(int tollboothnumber) {
        this.tollboothnumber = tollboothnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public float getStarttime() {
        return starttime;
    }

    public void setStarttime(float starttime) {
        this.starttime = starttime;
    }

    public float getEndtime() {
        return endtime;
    }

    public void setEndtime(float endtime) {
        this.endtime = endtime;
    }


    @Override
    public String toString() {
        return "ShiftAttendance{" +
                "operatorname='" + operatorname + '\'' +
                ", Shift='" + Shift + '\'' +
                ", tollboothnumber=" + tollboothnumber +
                ", id=" + id +
                ", date=" + date +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                '}';
    }
}
