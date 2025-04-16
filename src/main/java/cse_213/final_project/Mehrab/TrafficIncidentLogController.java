package cse_213.final_project.Mehrab;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class TrafficIncidentLogController
{
    @javafx.fxml.FXML
    private TextField locationField;
    @javafx.fxml.FXML
    private DatePicker incidentDatePicker;
    @javafx.fxml.FXML
    private ComboBox incidentStatusComboBox;
    @javafx.fxml.FXML
    private TextArea incidentDescriptionField;
    @javafx.fxml.FXML
    private TextField officerNameField;
    @javafx.fxml.FXML
    private Label errorMessage;
    @javafx.fxml.FXML
    private ComboBox incidentTypeComboBox;
    @javafx.fxml.FXML
    private TextArea incidentDataArea;
    @javafx.fxml.FXML
    private ComboBox severityLevelComboBox;
    @javafx.fxml.FXML
    private Button logIncidentButton;
    @javafx.fxml.FXML
    private Label confirmationMessage;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logIncidentButtonOA(ActionEvent actionEvent) {
    }
}