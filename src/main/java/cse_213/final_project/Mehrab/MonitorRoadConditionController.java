package cse_213.final_project.Mehrab;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class MonitorRoadConditionController {

    @FXML
    private TextField roadNameField;
    @FXML
    private TableColumn<RoadCondition, String> severityColumn;
    @FXML
    private TableColumn<RoadCondition, String> roadNameColumn;
    @FXML
    private TableColumn<RoadCondition, LocalDate> dateReportedColumn;
    @FXML
    private ComboBox<String> conditionComboBox;
    @FXML
    private DatePicker dateReportedPicker;
    @FXML
    private TableView<RoadCondition> roadConditionTableView;
    @FXML
    private Label errorMessage;
    @FXML
    private ComboBox<String> severityComboBox;
    @FXML
    private TableColumn<RoadCondition, String> conditionColumn;
    @FXML
    private Button saveConditionButton;
    @FXML
    private Label confirmationMessage;

    private ObservableList<RoadCondition> roadConditions;

    @FXML
    public void initialize() {
        conditionComboBox.setItems(FXCollections.observableArrayList("Good", "Fair", "Poor"));
        severityComboBox.setItems(FXCollections.observableArrayList("Low", "Medium", "High"));
    }

    @javafx.fxml.FXML
    public void saveConditionButtonOA(ActionEvent actionEvent) {
    }
}