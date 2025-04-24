package cse_213.final_project.Shahriar.modelclass2;

public class Announcement {
    private String title;
    private String messageArea;
    private String Audience;
    private String Date;

    public Announcement(String title, String messageArea, String audience, String date) {
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

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
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
