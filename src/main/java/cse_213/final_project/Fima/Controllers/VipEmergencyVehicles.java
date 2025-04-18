package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class VipEmergencyVehicles {

    @FXML
    private Label PriorityPassageLable;

    @FXML
    private TableColumn<String, VipEmergencyVehicles> PriorityPassagetablecolumn;

    @FXML
    private TextField RegNumTextfield;

    @FXML
    private TableColumn<String, VipEmergencyVehicles> RegNumtablecolumn;

    @FXML
    private TableColumn<String, VipEmergencyVehicles> VehicleModeltablecolumn;

    @FXML
    private ComboBox<?> VehicleTypecombobox;

    @FXML
    private TableColumn<String, VipEmergencyVehicles> VehicleTypetablecolumn;

    @FXML
    private RadioButton noradiobutton;

    @FXML
    private TableView<?> showdatatableview;

    @FXML
    private TextField vehiclemodeltextfield;

    @FXML
    private RadioButton yesradiobutton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void generateOnActionButton(ActionEvent event) {

    }

}
