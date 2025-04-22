package cse_213.final_project.Tawhid;

import java.util.Date;

public class FoundItem {
    private String itemType;
    private String foundBy;
    private String matchedOwnerName;
    private String matchedPhone;
    private Date dateFound;

    public FoundItem(String itemType, String foundBy, String matchedOwnerName, String matchedPhone, Date dateFound) {
        this.itemType = itemType;
        this.foundBy = foundBy;
        this.matchedOwnerName = matchedOwnerName;
        this.matchedPhone = matchedPhone;
        this.dateFound = dateFound;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getFoundBy() {
        return foundBy;
    }

    public void setFoundBy(String foundBy) {
        this.foundBy = foundBy;
    }

    public String getMatchedOwnerName() {
        return matchedOwnerName;
    }

    public void setMatchedOwnerName(String matchedOwnerName) {
        this.matchedOwnerName = matchedOwnerName;
    }

    public String getMatchedPhone() {
        return matchedPhone;
    }

    public void setMatchedPhone(String matchedPhone) {
        this.matchedPhone = matchedPhone;
    }

    public Date getDateFound() {
        return dateFound;
    }

    public void setDateFound(Date dateFound) {
        this.dateFound = dateFound;
    }

    @Override
    public String toString() {
        return "FoundItem{" +
                "itemType='" + itemType + '\'' +
                ", foundBy='" + foundBy + '\'' +
                ", matchedOwnerName='" + matchedOwnerName + '\'' +
                ", matchedPhone='" + matchedPhone + '\'' +
                ", dateFound=" + dateFound +
                '}';
    }
}
