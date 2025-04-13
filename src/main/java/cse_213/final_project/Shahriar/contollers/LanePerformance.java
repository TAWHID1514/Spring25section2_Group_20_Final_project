package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class LanePerformance
{
    @javafx.fxml.FXML
    private BarChart lanechart;
    @javafx.fxml.FXML
    private Label labelStatus;
    @javafx.fxml.FXML
    private DatePicker datepicker;
    @javafx.fxml.FXML
    private ComboBox<String> lanesectorcombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleperforfanceonaction(ActionEvent actionEvent) {

    }
}