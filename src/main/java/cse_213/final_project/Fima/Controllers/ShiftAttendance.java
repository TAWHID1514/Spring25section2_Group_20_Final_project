package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ShiftAttendance {

    @FXML
    private DatePicker DATEDATEPICKER;

    @FXML
    private RadioButton DAYRADIOBUTTON;

    @FXML
    private TableColumn<?, ?> DateTABLECOLUMN;

    @FXML
    private TextField ENDTIMETEXTFIELD;

    @FXML
    private TableColumn<?, ?> EndTimeTABLECOLUMN;

    @FXML
    private TableColumn<?, ?> IDTABLECOLUMN;

    @FXML
    private TextField IDTEXTFIELD;

    @FXML
    private RadioButton NIGHTRADIOBUTTON;

    @FXML
    private TextField OPERATORNAMETEXTFIELD;

    @FXML
    private TableColumn<?, ?> OperatorNameTABLECOLUMN;

    @FXML
    private TableView<?> SHOWDATATABLEVIEW;

    @FXML
    private TextField STARTTIMETEXTFIELD;

    @FXML
    private TableColumn<?, ?> ShiftTABLECOLUMN;

    @FXML
    private TableColumn<?, ?> StartTimeTABLECOLUMN;

    @FXML
    private ComboBox<?> TOLLBOOTHOPERATORCOMBOBOX;

    @FXML
    private TableColumn<?, ?> TollBoothNumberTABLECOLUMN;

    @FXML
    void BACKONACTIONBUTTON(ActionEvent event) {

    }

    @FXML
    void SUBMITONACTIONBUTTON(ActionEvent event) {

    }

}
