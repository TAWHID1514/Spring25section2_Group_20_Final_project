package cse_213.final_project.Mehrab;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.time.LocalDate;

public class DispatchMaintenanceTeamController {

    @FXML
    private ComboBox<String> incidentTypeComboBox;
    @FXML
    private TextField locationField;
    @FXML
    private TextArea descriptionField;
    @FXML
    private ComboBox<String> maintenanceTeamComboBox;
    @FXML
    private ComboBox<String> priorityLevelComboBox;
    @FXML
    private DatePicker dispatchDatePicker;
    @FXML
    private DatePicker completionDatePicker;
    @FXML
    private Button dispatchButton;
    @FXML
    private TableView<MaintenanceTask> maintenanceTable;
    @FXML
    private TableColumn<MaintenanceTask, String> incidentTypeColumn;
    @FXML
    private TableColumn<MaintenanceTask, String> locationColumn;
    @FXML
    private TableColumn<MaintenanceTask, String> maintenanceTeamColumn;
    @FXML
    private TableColumn<MaintenanceTask, String> priorityLevelColumn;
    @FXML
    private TableColumn<MaintenanceTask, LocalDate> dispatchDateColumn;
    @FXML
    private TableColumn<MaintenanceTask, LocalDate> completionDateColumn;
    @FXML
    private Label errorMessage;
    @FXML
    private Label confirmationMessage;

    private ObservableList<MaintenanceTask> maintenanceTasks;

    @FXML
    public void initialize() {
        incidentTypeComboBox.getItems().addAll("Electrical", "Plumbing", "Carpentry");
        maintenanceTeamComboBox.getItems().addAll("Team A", "Team B", "Team C");
        priorityLevelComboBox.getItems().addAll("Low", "Medium", "High");

        maintenanceTasks = FXCollections.observableArrayList();
        maintenanceTable.setItems(maintenanceTasks);

    }

    @FXML
    public void dispatchButtonOA() {

    }

    @FXML
    public void viewTableOA() {
    }


}
