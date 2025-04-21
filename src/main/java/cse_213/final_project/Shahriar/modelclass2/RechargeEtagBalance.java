package cse_213.final_project.Shahriar.modelclass2;

public class RechargeEtagBalance {
    private String rechargeid;
    private Double rechargeAmount;

    public RechargeEtagBalance(String rechargeid, Double rechargeAmount) {
        this.rechargeid = rechargeid;
        this.rechargeAmount = rechargeAmount;
    }

    public String getRechargeid() {
        return rechargeid;
    }

    public void setRechargeid(String rechargeid) {
        this.rechargeid = rechargeid;
    }

    public Double getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(Double rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    @Override
    public String toString() {
        return "RechargeEtagBalance{" +
                "rechargeid='" + rechargeid + '\'' +
                ", rechargeAmount=" + rechargeAmount +
                '}';
    }
}
