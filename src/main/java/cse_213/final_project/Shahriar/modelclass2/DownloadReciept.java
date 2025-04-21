package cse_213.final_project.Shahriar.modelclass2;

import java.time.LocalDate;

public class DownloadReciept {
    private String TranSectionId;
    private LocalDate Date;
    private String vehiclesNo;
    private String paymentMethod;
    private String textArea;
    private String amount;

    public DownloadReciept(String tranSectionId, LocalDate date, String vehiclesNo, String paymentMethod, String textArea, String amount) {
        TranSectionId = tranSectionId;
        Date = date;
        this.vehiclesNo = vehiclesNo;
        this.paymentMethod = paymentMethod;
        this.textArea = textArea;
        this.amount = amount;
    }

    public String getTranSectionId() {
        return TranSectionId;
    }

    public void setTranSectionId(String tranSectionId) {
        TranSectionId = tranSectionId;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public String getVehiclesNo() {
        return vehiclesNo;
    }

    public void setVehiclesNo(String vehiclesNo) {
        this.vehiclesNo = vehiclesNo;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTextArea() {
        return textArea;
    }

    public void setTextArea(String textArea) {
        this.textArea = textArea;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "DownloadReciept{" +
                "TranSectionId='" + TranSectionId + '\'' +
                ", Date=" + Date +
                ", vehiclesNo='" + vehiclesNo + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", textArea='" + textArea + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
