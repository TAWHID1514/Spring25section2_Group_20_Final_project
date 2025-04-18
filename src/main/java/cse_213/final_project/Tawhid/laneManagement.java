package cse_213.final_project.Tawhid;

public class laneManagement {
    String Lane1,Lane2,Lane3,Lane4,Lane5,Lane6;

    public laneManagement(String lane1, String lane2, String lane3, String lane4, String lane5, String lane6) {
        Lane1 = lane1;
        Lane2 = lane2;
        Lane3 = lane3;
        Lane4 = lane4;
        Lane5 = lane5;
        Lane6 = lane6;
    }

    public String getLane1() {
        return Lane1;
    }

    public void setLane1(String lane1) {
        Lane1 = lane1;
    }

    public String getLane2() {
        return Lane2;
    }

    public void setLane2(String lane2) {
        Lane2 = lane2;
    }

    public String getLane3() {
        return Lane3;
    }

    public void setLane3(String lane3) {
        Lane3 = lane3;
    }

    public String getLane4() {
        return Lane4;
    }

    public void setLane4(String lane4) {
        Lane4 = lane4;
    }

    public String getLane5() {
        return Lane5;
    }

    public void setLane5(String lane5) {
        Lane5 = lane5;
    }

    public String getLane6() {
        return Lane6;
    }

    public void setLane6(String lane6) {
        Lane6 = lane6;
    }

    @Override
    public String toString() {
        return "laneManagement{" +
                "Lane1='" + Lane1 + '\'' +
                ", Lane2='" + Lane2 + '\'' +
                ", Lane3='" + Lane3 + '\'' +
                ", Lane4='" + Lane4 + '\'' +
                ", Lane5='" + Lane5 + '\'' +
                ", Lane6='" + Lane6 + '\'' +
                '}';
    }
}
