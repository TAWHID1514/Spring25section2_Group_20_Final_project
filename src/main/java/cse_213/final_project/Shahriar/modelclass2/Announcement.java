package cse_213.final_project.Shahriar.modelclass2;

import java.time.LocalDateTime;

public class Announcement {
    private String title;
    private String messageArea;
    private String Audience;
    private LocalDateTime Date;

    public Announcement(String title, String messageArea, String audience, LocalDateTime date) {
        this.title = title;
        this.messageArea = messageArea;
        Audience = audience;
        Date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessageArea() {
        return messageArea;
    }

    public void setMessageArea(String messageArea) {
        this.messageArea = messageArea;
    }

    public String getAudience() {
        return Audience;
    }

    public void setAudience(String audience) {
        Audience = audience;
    }

    public LocalDateTime getDate() {
        return Date;
    }

    public void setDate(LocalDateTime date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "title='" + title + '\'' +
                ", messageArea='" + messageArea + '\'' +
                ", Audience='" + Audience + '\'' +
                ", Date=" + Date +
                '}';
    }
}
