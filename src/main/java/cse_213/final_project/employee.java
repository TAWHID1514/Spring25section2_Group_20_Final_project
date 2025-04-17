package cse_213.final_project;

import java.time.LocalDate;

public class employee {
    String name,password,phoneNo;
    LocalDate DOB;
    int Id;

    public employee(String name, String password, String phoneNo, LocalDate DOB, int id) {
        this.name = name;
        this.password = password;
        this.phoneNo = phoneNo;
        this.DOB = DOB;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", DOB=" + DOB +
                ", Id=" + Id +
                '}';
    }
}
