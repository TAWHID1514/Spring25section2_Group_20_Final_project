package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class IncidentReportsPlazaL6 {

    @FXML
    private ComboBox<?> BoothNumbercombobox;

    @FXML
    private TableColumn<String, IncidentReportsPlazaL6> BoothNumbertablecolumn;

    @FXML
    private TableColumn<String, IncidentReportsPlazaL6> IncidentDetailstablecolumn;

    @FXML
    private TextArea IncidentDetailstextarea;

    @FXML
    private DatePicker ReportDatedatepicker;

    @FXML
    private TableColumn<String, IncidentReportsPlazaL6> ReportDatetablecolumn;

    @FXML
    private TableColumn<String, IncidentReportsPlazaL6> ReportTimetablecolumn;

    @FXML
    private TextField reporttimetextfield;

    @FXML
    private TableView<?> showdatatableview;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void Submitonactionbutton(ActionEvent event) {

    }

    @FXML
    void homeonactionbutton(ActionEvent event) {

    }

}
