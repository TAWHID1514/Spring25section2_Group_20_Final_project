package cse_213.final_project.Mehrab;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class DailyRevenueReportController
{
    @javafx.fxml.FXML
    private TableColumn vehicleTypeColumn;
    @javafx.fxml.FXML
    private TableColumn totalRevenueColumn;
    @javafx.fxml.FXML
    private TextField numVehiclesField;
    @javafx.fxml.FXML
    private Label errorMessage;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private ComboBox vehicleTypeComboBox;
    @javafx.fxml.FXML
    private Button generateReportButton;
    @javafx.fxml.FXML
    private TableColumn dateColumn;
    @javafx.fxml.FXML
    private TableView revenueReportTable;
    @javafx.fxml.FXML
    private TableColumn numVehiclesColumn;
    @javafx.fxml.FXML
    private Label confirmationMessage;
    @javafx.fxml.FXML
    private TextField tollField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleGenerateReport(ActionEvent actionEvent) {
    }
}