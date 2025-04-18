package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class VehicleInformation {

    @FXML
    private TableColumn<String, VehicleInformation> Datetablecolumn;

    @FXML
    private TableColumn<String, VehicleInformation> OwnerNametablecolumn;

    @FXML
    private TableColumn<String, VehicleInformation> RegNumtablecolumn;

    @FXML
    private Label Regestrationlable;

    @FXML
    private TableColumn<String, VehicleInformation> Regestrationtablecolumn;

    @FXML
    private ComboBox<?> VehicleTollcombobox;

    @FXML
    private TableColumn<String, VehicleInformation> VehicleTolltablecolumn;

    @FXML
    private ComboBox<?> VehicleTypecombobox;

    @FXML
    private TableColumn<String, VehicleInformation> VehicleTypetablecolumn;

    @FXML
    private RadioButton Yesradiobutton;

    @FXML
    private DatePicker datedatepicker;

    @FXML
    private RadioButton noradiobutton;

    @FXML
    private TextField ownernametextfield;

    @FXML
    private TextField regnumtextfield;

    @FXML
    private TableView<?> tableview;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void backOnActionButton(ActionEvent event) {

    }

    @FXML
    void saveOnActionButton(ActionEvent event) {

    }

}
