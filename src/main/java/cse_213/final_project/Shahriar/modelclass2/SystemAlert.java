package cse_213.final_project.Shahriar.modelclass2;

import java.time.LocalDateTime;

public class SystemAlert {
    private String lane;
    private String component;
    private String issue;
    private LocalDateTime time;

    public SystemAlert(String lane, String component, LocalDateTime time, String issue) {
        this.lane = lane;
        this.component = component;
        this.time = time;
        this.issue = issue;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "SystemAlert{" +
                "lane='" + lane + '\'' +
                ", component='" + component + '\'' +
                ", issue='" + issue + '\'' +
                ", time=" + time +
                '}';
    }
}
