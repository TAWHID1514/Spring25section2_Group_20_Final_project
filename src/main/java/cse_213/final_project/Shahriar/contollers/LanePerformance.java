package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.*;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.awt.*;
import java.time.LocalDate;

public class LanePerformance {

    @FXML
    private BarChart<String, Number> lanechart;

    @FXML
    private Label labelStatus;

    @FXML
    private DatePicker datepicker;

    @FXML
    private ComboBox<String> lanesectorcombobox;

    @FXML
    private Button backOnaction;

    @FXML
    public void initialize() {
        // Populate combo box with lane/sector names
        lanesectorcombobox.getItems().addAll("Lane A", "Lane B", "Lane C");

        // Set up the BarChart
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        lanechart.setTitle("Lane Performance");
        xAxis.setLabel("Lane");
        yAxis.setLabel("Vehicles Passed");

        // Optional default data (e.g., today's performance)
        populateChart("Lane A", LocalDate.now());
    }

    @FXML
    public void handlePerformanceOnAction(ActionEvent event) {
        String selectedLane = lanesectorcombobox.getValue();
        LocalDate selectedDate = datepicker.getValue();

        if (selectedLane == null || selectedDate == null) {
            labelStatus.setText("Please select both lane and date.");
            return;
        }

        populateChart(selectedLane, selectedDate);
    }

    private void populateChart(String lane, LocalDate date) {
        lanechart.getData().clear();

        // Sample data - Replace this with actual DB or logic
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Performance on " + date.toString());

        series.getData().add(new XYChart.Data<>("Morning", 120));
        series.getData().add(new XYChart.Data<>("Afternoon", 180));
        series.getData().add(new XYChart.Data<>("Evening", 95));

        lanechart.getData().add(series);

        labelStatus.setText("Showing data for " + lane + " on " + date.toString());
    }

    @FXML
    public void backOnaction(ActionEvent event) {
        // Logic to go back to dashboard or previous screen
    }
}