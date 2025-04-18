package cse_213.final_project.Mehrab;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.*;

public class MonitorIncidentResponseTimeController
{
    @javafx.fxml.FXML
    private TextField timeToResolveField;
    @javafx.fxml.FXML
    private TableColumn timeToResolveColumn;
    @javafx.fxml.FXML
    private CategoryAxis xAxis;
    @javafx.fxml.FXML
    private Button addDataButton;
    @javafx.fxml.FXML
    private TextField incidentIdField;
    @javafx.fxml.FXML
    private Label errorMessage;
    @javafx.fxml.FXML
    private TableColumn timeOfReportColumn;
    @javafx.fxml.FXML
    private DatePicker timeOfArrivalPicker;
    @javafx.fxml.FXML
    private TableColumn incidentTypeColumn;
    @javafx.fxml.FXML
    private NumberAxis yAxis;
    @javafx.fxml.FXML
    private TextField incidentTypeField;
    @javafx.fxml.FXML
    private TableColumn incidentIdColumn;
    @javafx.fxml.FXML
    private BarChart responseTimeBarChart;
    @javafx.fxml.FXML
    private DatePicker timeOfReportPicker;
    @javafx.fxml.FXML
    private TableColumn timeOfArrivalColumn;
    @javafx.fxml.FXML
    private TableView responseTimeTableView;
    @javafx.fxml.FXML
    private Label confirmationMessage;

    @javafx.fxml.FXML
    public void initialize() {
    }}