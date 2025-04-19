package cse_213.final_project.Mehrab;

import java.time.LocalDate;

public class MaintenanceTask {

    private String incidentType;
    private String location;
    private String description;
    private String maintenanceTeam;
    private String priorityLevel;
    private LocalDate dispatchDate;
    private LocalDate completionDate;

    public MaintenanceTask(String incidentType, String location, String description, String maintenanceTeam,
                           String priorityLevel, LocalDate dispatchDate, LocalDate completionDate) {
        this.incidentType = incidentType;
        this.location = location;
        this.description = description;
        this.maintenanceTeam = maintenanceTeam;
        this.priorityLevel = priorityLevel;
        this.dispatchDate = dispatchDate;
        this.completionDate = completionDate;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaintenanceTeam() {
        return maintenanceTeam;
    }

    public void setMaintenanceTeam(String maintenanceTeam) {
        this.maintenanceTeam = maintenanceTeam;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public LocalDate getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(LocalDate dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }


}
