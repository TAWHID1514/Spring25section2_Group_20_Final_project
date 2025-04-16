package cse_213.final_project.Mehrab;

import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.*;

public class EvaluateResponsePerformanceController
{
    @javafx.fxml.FXML
    private ComboBox teamPerformanceComboBox;
    @javafx.fxml.FXML
    private BarChart performanceBarChart;
    @javafx.fxml.FXML
    private CategoryAxis xAxis;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private Label errorMessage;
    @javafx.fxml.FXML
    private ComboBox incidentTypeComboBox;
    @javafx.fxml.FXML
    private TextField responseTimeField;
    @javafx.fxml.FXML
    private Button evaluatePerformanceButton;
    @javafx.fxml.FXML
    private NumberAxis yAxis;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private TextField numIncidentsField;
    @javafx.fxml.FXML
    private ComboBox efficiencyRatingComboBox;
    @javafx.fxml.FXML
    private TextArea performanceDataArea;
    @javafx.fxml.FXML
    private Label confirmationMessage;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void evaluatePerformanceButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showbarChartOA(ActionEvent actionEvent) {
    }
}