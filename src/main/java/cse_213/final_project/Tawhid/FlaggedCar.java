package cse_213.final_project.Tawhid;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class FlaggedCar implements Serializable {
    private static final long serialVersionUID = 1L;
    private String regNo;
    private List<String> reasons;
    private String licenceNo;
    private LocalDate flaggedDate;

    // for police Authurity
    private Double fineAmount;
    private LocalDate fineDueDate;

    public FlaggedCar(String regNo, List<String> reasons, String licenceNo, LocalDate flaggedDate) {
        this.regNo = regNo;
        this.reasons = reasons;
        this.licenceNo = licenceNo;
        this.flaggedDate = flaggedDate;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public List<String> getReasons() {
        return reasons;
    }

    public void setReasons(List<String> reasons) {
        this.reasons = reasons;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public LocalDate getFlaggedDate() {
        return flaggedDate;
    }

    public void setFlaggedDate(LocalDate flaggedDate) {
        this.flaggedDate = flaggedDate;
    }

    public Double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(Double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public LocalDate getFineDueDate() {
        return fineDueDate;
    }

    public void setFineDueDate(LocalDate fineDueDate) {
        this.fineDueDate = fineDueDate;
    }

    @Override
    public String toString() {
        return "FlaggedCar{" +
                "regNo='" + regNo + '\'' +
                ", reasons=" + reasons +
                ", licenceNo='" + licenceNo + '\'' +
                ", flaggedDate=" + flaggedDate +
                ", fineAmount=" + fineAmount +
                ", fineDueDate=" + fineDueDate +
                '}';
    }
}
