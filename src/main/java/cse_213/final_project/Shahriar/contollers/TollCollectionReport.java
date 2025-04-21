package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.control.*;

public class TollCollectionReport
{
    @javafx.fxml.FXML
    private BarChart barchart;
    @javafx.fxml.FXML
    private Label tollcollectionReportfxid;
    @javafx.fxml.FXML
    private TableColumn fromDatecolum;
    @javafx.fxml.FXML
    private DatePicker fromDatepicker;
    @javafx.fxml.FXML
    private TableColumn yollcollectcolum;
    @javafx.fxml.FXML
    private TableView tableview;
    @javafx.fxml.FXML
    private TableColumn vehiclePassedcolum;
    @javafx.fxml.FXML
    private ComboBox monthlyTypecombobox;
    @javafx.fxml.FXML
    private DatePicker todatepicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateonaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportaspdfOnacttion(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void excellaspdfonaction(ActionEvent actionEvent) {
    }
}