package cse_213.final_project.Fima.LiaisonOfficer;

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
    private TableColumn<?, ?> BoothNumbertablecolumn;

    @FXML
    private TableColumn<?, ?> IncidentDetailstablecolumn;

    @FXML
    private TextArea IncidentDetailstextarea;

    @FXML
    private DatePicker ReportDatedatepicker;

    @FXML
    private TableColumn<?, ?> ReportDatetablecolumn;

    @FXML
    private TableColumn<?, ?> ReportTimetablecolumn;

    @FXML
    private TextField reporttimetextfield;

    @FXML
    private TableView<?> showdatatableview;

    @FXML
    void Submitonactionbutton(ActionEvent event) {

    }

    @FXML
    void homeonactionbutton(ActionEvent event) {

    }

}
