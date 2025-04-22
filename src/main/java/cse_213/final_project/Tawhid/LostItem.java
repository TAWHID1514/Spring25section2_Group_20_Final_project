package cse_213.final_project.Tawhid;

import java.util.Date;

public class LostItem {
    private String itemType;
    private String description;
    private String ownerName;
    private String ownerPhone;
    private Date dateLost;

    public LostItem(String itemType, String description, String ownerName, String ownerPhone, Date dateLost) {
        this.itemType = itemType;
        this.description = description;
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
        this.dateLost = dateLost;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public Date getDateLost() {
        return dateLost;
    }

    public void setDateLost(Date dateLost) {
        this.dateLost = dateLost;
    }

    @Override
    public String toString() {
        return "LostItem{" +
                "itemType='" + itemType + '\'' +
                ", description='" + description + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerPhone='" + ownerPhone + '\'' +
                ", dateLost=" + dateLost +
                '}';
    }
}
