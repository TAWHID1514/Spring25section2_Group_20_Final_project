package cse_213.final_project.Fima.LiaisonOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DailyShiftReports {

    @FXML
    private TableColumn<?, ?> BoothIDtablecolumn;

    @FXML
    private TextField BoothIDtextfield;

    @FXML
    private TableColumn<?, ?> Issuetablecolumn;

    @FXML
    private TableColumn<?, ?> TollOperatortablecolumn;

    @FXML
    private TextField TollOperatortextfield;

    @FXML
    private TableColumn<?, ?> VehicleCounttablecolumn;

    @FXML
    private TextArea describeissuetextarea;

    @FXML
    private TableView<?> showdatatableview;

    @FXML
    private TextField vehiclecounttextfield;

    @FXML
    void homeonactionbutton(ActionEvent event) {

    }

    @FXML
    void submitonactionbutton(ActionEvent event) {

    }

}
