package cse_213.final_project;

import java.time.LocalDate;

public abstract class User  {
    String Name,Email,phoneNo,password,type,addrass;
    int Id;
    LocalDate DOB;

    public User(String name, String email, String phoneNo, String password, String type, String addrass, int id, LocalDate DOB) {
        Name = name;
        Email = email;
        this.phoneNo = phoneNo;
        this.password = password;
        this.type = type;
        this.addrass = addrass;
        Id = id;
        this.DOB = DOB;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddrass() {
        return addrass;
    }

    public void setAddrass(String addrass) {
        this.addrass = addrass;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", addrass='" + addrass + '\'' +
                ", Id=" + Id +
                ", DOB=" + DOB +
                '}';
    }
}
