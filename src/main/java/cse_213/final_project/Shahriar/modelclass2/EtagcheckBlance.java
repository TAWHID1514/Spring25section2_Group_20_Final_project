package cse_213.final_project.Shahriar.modelclass2;

public class EtagcheckBlance {
    private String Name;
    private String ETagId;
    private String Blance;
    private String textArea;

    public EtagcheckBlance(String name, String ETagId, String blance, String textArea) {
        Name = name;
        this.ETagId = ETagId;
        Blance = blance;
        this.textArea = textArea;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getETagId() {
        return ETagId;
    }

    public void setETagId(String ETagId) {
        this.ETagId = ETagId;
    }

    public String getBlance() {
        return Blance;
    }

    public void setBlance(String blance) {
        Blance = blance;
    }

    public String getTextArea() {
        return textArea;
    }

    public void setTextArea(String textArea) {
        this.textArea = textArea;
    }

    @Override
    public String toString() {
        return "EtagcheckBlance{" +
                "Name='" + Name + '\'' +
                ", ETagId='" + ETagId + '\'' +
                ", Blance='" + Blance + '\'' +
                ", textArea='" + textArea + '\'' +
                '}';
    }
}
