package cse_213.final_project.Mehrab;

import javafx.beans.property.*;

import java.time.LocalDate;

public class RoadCondition {

    private final StringProperty roadName;
    private final StringProperty condition;
    private final StringProperty severity;
    private final ObjectProperty<LocalDate> dateReported;

    public RoadCondition(String roadName, String condition, String severity, LocalDate dateReported) {
        this.roadName = new SimpleStringProperty(roadName);
        this.condition = new SimpleStringProperty(condition);
        this.severity = new SimpleStringProperty(severity);
        this.dateReported = new SimpleObjectProperty<>(dateReported);
    }

    public String getRoadName() {
        return roadName.get();
    }

    public void setRoadName(String roadName) {
        this.roadName.set(roadName);
    }

    public StringProperty roadNameProperty() {
        return roadName;
    }

    public String getCondition() {
        return condition.get();
    }

    public void setCondition(String condition) {
        this.condition.set(condition);
    }

    public StringProperty conditionProperty() {
        return condition;
    }

    public String getSeverity() {
        return severity.get();
    }

    public void setSeverity(String severity) {
        this.severity.set(severity);
    }

    public StringProperty severityProperty() {
        return severity;
    }

    public LocalDate getDateReported() {
        return dateReported.get();
    }

    public void setDateReported(LocalDate dateReported) {
        this.dateReported.set(dateReported);
    }

    public ObjectProperty<LocalDate> dateReportedProperty() {
        return dateReported;
    }
}
