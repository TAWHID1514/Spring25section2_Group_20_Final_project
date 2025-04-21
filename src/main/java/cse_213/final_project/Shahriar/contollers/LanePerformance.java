package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.scene.chart.LineChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.awt.*;

public class LanePerformance
{
    @javafx.fxml.FXML
    private ComboBox selectlanecombobox;
    @javafx.fxml.FXML
    private Label lanePerformancefxid;
    @javafx.fxml.FXML
    private DatePicker fromDatepicker;
    @javafx.fxml.FXML
    private Label labelstatusfxid;
    @javafx.fxml.FXML
    private DatePicker toDatepicker;
    @javafx.fxml.FXML
    private LineChart linechartfxid;
    @javafx.fxml.FXML
    private TextField vehiclesPassedfxid;
    @javafx.fxml.FXML
    private TextField avegeTimefxid;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handlePerformanceOnactoion(ActionEvent actionEvent) {
    }
}