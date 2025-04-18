package cse_213.final_project.Fima.ModelClass;

public class TechnicalIssues {
    public String technicalissue,issuetype;


    public TechnicalIssues(String technicalissue, String issuetype) {
        this.technicalissue = technicalissue;
        this.issuetype = issuetype;
    }

    public String getTechnicalissue() {
        return technicalissue;
    }

    public void setTechnicalissue(String technicalissue) {
        this.technicalissue = technicalissue;
    }

    public String getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(String issuetype) {
        this.issuetype = issuetype;
    }


    @Override
    public String toString() {
        return "TechnicalIssues{" +
                "technicalissue='" + technicalissue + '\'' +
                ", issuetype='" + issuetype + '\'' +
                '}';
    }
}
