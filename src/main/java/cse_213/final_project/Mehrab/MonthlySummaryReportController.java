package cse_213.final_project.Mehrab;

import javafx.event.*;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;

public class MonthlySummaryReportController{

    @javafx.fxml.FXML
    private TableColumn monthColumn;
    @javafx.fxml.FXML
    private TableView summaryTable;
    @javafx.fxml.FXML
    private PieChart revenuePieChart;
    @javafx.fxml.FXML
    private DatePicker monthPicker;
    @javafx.fxml.FXML
    private TableColumn totalRevenueColumn;
    @javafx.fxml.FXML
    private TextField numVehiclesField;
    @javafx.fxml.FXML
    private Label errorMessage;
    @javafx.fxml.FXML
    private TextField totalRevenueField;
    @javafx.fxml.FXML
    private Button generateSummaryButton;
    @javafx.fxml.FXML
    private TableColumn numVehiclesColumn;
    @javafx.fxml.FXML
    private Label confirmationMessage;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleGenerateSummary(ActionEvent actionEvent) {
    }
}