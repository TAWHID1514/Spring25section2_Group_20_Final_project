package cse_213.final_project.Tawhid.PoliceAuthurity;

public class help {
    String name;
    int ID;

    public help() {
    }

    public help(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "help{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
