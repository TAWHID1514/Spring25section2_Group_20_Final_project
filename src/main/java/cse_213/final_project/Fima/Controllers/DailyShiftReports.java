package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DailyShiftReports {

    @FXML
    private TableColumn<String, DailyShiftReports> BoothIDtablecolumn;

    @FXML
    private TextField BoothIDtextfield;

    @FXML
    private TableColumn<String, DailyShiftReports> Issuetablecolumn;

    @FXML
    private TableColumn<String, DailyShiftReports> TollOperatortablecolumn;

    @FXML
    private TextField TollOperatortextfield;

    @FXML
    private TableColumn<String, DailyShiftReports> VehicleCounttablecolumn;

    @FXML
    private TextArea describeissuetextarea;

    @FXML
    private TableView<?> showdatatableview;

    @FXML
    private TextField vehiclecounttextfield;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void homeonactionbutton(ActionEvent event) {

    }

    @FXML
    void submitonactionbutton(ActionEvent event) {

    }

}
