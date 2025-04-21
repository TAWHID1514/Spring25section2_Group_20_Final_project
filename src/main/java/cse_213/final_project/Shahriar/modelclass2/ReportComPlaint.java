package cse_213.final_project.Shahriar.modelclass2;

import java.time.LocalDate;

public class ReportComPlaint {
    private String issueType;
    private LocalDate Date;
    private String fileName;

    public ReportComPlaint(String issueType, LocalDate date, String fileName) {
        this.issueType = issueType;
        Date = date;
        this.fileName = fileName;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "ReportComPlaint{" +
                "issueType='" + issueType + '\'' +
                ", Date=" + Date +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
