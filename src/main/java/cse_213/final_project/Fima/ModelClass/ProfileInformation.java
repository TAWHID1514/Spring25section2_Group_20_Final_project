package cse_213.final_project.Fima.ModelClass;

import java.time.LocalDate;

public class ProfileInformation {

    public String name,gender;
    public int id,age;
    public LocalDate Dob,Doj;

    public ProfileInformation(String name, String gender, int id, int age, LocalDate dob, LocalDate doj) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.age = age;
        Dob = dob;
        Doj = doj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return Dob;
    }

    public void setDob(LocalDate dob) {
        Dob = dob;
    }

    public LocalDate getDoj() {
        return Doj;
    }

    public void setDoj(LocalDate doj) {
        Doj = doj;
    }


    @Override
    public String toString() {
        return "ProfileInformation{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", Dob=" + Dob +
                ", Doj=" + Doj +
                '}';
    }
}
