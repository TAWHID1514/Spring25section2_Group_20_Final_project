package cse_213.final_project.Mehrab;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class DailyRevenueReportController {

    @FXML
    private TableColumn<String, String> vehicleTypeColumn;
    @FXML
    private TableColumn<String, Double> totalRevenueColumn;
    @FXML
    private TextField numVehiclesField;
    @FXML
    private Label errorMessage;
    @FXML
    private DatePicker datePicker;
    @FXML
    private ComboBox<String> vehicleTypeComboBox;
    @FXML
    private Button generateReportButton;
    @FXML
    private TableColumn<RevenueReport, LocalDate> dateColumn;
    @FXML
    private TableView<RevenueReport> revenueReportTable;
    @FXML
    private TableColumn<RevenueReport, Integer> numVehiclesColumn;
    @FXML
    private Label confirmationMessage;
    @FXML
    private TextField tollField;

    private ObservableList<RevenueReport> revenueReports;

    @FXML
    public void initialize() {
        vehicleTypeComboBox.setItems(FXCollections.observableArrayList("Car", "Truck", "Bus"));
        revenueReports = FXCollections.observableArrayList();
        revenueReportTable.setItems(revenueReports);


    }

    @FXML
    public void handleGenerateReport(ActionEvent actionEvent) {
    }
}

