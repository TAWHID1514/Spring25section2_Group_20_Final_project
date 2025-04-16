package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ProfileInformation {

    @FXML
    private TableColumn<?, ?> AGETABLECOLUMN;

    @FXML
    private TextField AGETEXTFIELD;

    @FXML
    private Label DateofBirthDATEPICKER;

    @FXML
    private TableColumn<?, ?> DateofBirthTABLECOLUMN;

    @FXML
    private TableColumn<?, ?> DateofJoiningTABLECOLUMN;

    @FXML
    private DatePicker DateofJoiningdatepicker;

    @FXML
    private RadioButton FemaleRADIOBUTTON;

    @FXML
    private TableColumn<?, ?> GenderTABLECOLUMN;

    @FXML
    private TableColumn<?, ?> IDTABLECOLUMN;

    @FXML
    private TextField IDTEXTFIELD;

    @FXML
    private RadioButton MALERADIOBUTTON;

    @FXML
    private TextField NAMETEXTFIELD;

    @FXML
    private TableColumn<?, ?> NameTABLECOLUMN;

    @FXML
    private TableView<?> SHOWDATATABLEVIEW;

    @FXML
    private DatePicker dateofbirthdatepicker;

    @FXML
    void HOMEONACTIONBUTTON(ActionEvent event) {

    }

    @FXML
    void SUBMITONACTIONBUTTON(ActionEvent event) {

    }

}
