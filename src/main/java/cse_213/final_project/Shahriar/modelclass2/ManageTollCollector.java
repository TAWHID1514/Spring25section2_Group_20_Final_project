package cse_213.final_project.Shahriar.modelclass2;

public class ManageTollCollector {
    private String CollectorName;
    private String SelectLane;
    private String SelectRole;
    private String statusLabel;

    public ManageTollCollector(String collectorName, String selectLane, String selectRole, String statusLabel) {
        CollectorName = collectorName;
        SelectLane = selectLane;
        SelectRole = selectRole;
        this.statusLabel = statusLabel;
    }

    public String getCollectorName() {
        return CollectorName;
    }

    public void setCollectorName(String collectorName) {
        CollectorName = collectorName;
    }

    public String getSelectLane() {
        return SelectLane;
    }

    public void setSelectLane(String selectLane) {
        SelectLane = selectLane;
    }

    public String getSelectRole() {
        return SelectRole;
    }

    public void setSelectRole(String selectRole) {
        SelectRole = selectRole;
    }

    public String getStatusLabel() {
        return statusLabel;
    }

    public void setStatusLabel(String statusLabel) {
        this.statusLabel = statusLabel;
    }

    @Override
    public String toString() {
        return "ManageTollCollector{" +
                "CollectorName='" + CollectorName + '\'' +
                ", SelectLane='" + SelectLane + '\'' +
                ", SelectRole='" + SelectRole + '\'' +
                ", statusLabel='" + statusLabel + '\'' +
                '}';
    }
}
