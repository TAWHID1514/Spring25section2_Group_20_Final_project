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
    private TableColumn<?, ?> PriorityPassagetablecolumn;

    @FXML
    private TextField RegNumTextfield;

    @FXML
    private TableColumn<?, ?> RegNumtablecolumn;

    @FXML
    private TableColumn<?, ?> VehicleModeltablecolumn;

    @FXML
    private ComboBox<?> VehicleTypecombobox;

    @FXML
    private TableColumn<?, ?> VehicleTypetablecolumn;

    @FXML
    private RadioButton noradiobutton;

    @FXML
    private TableView<?> showdatatableview;

    @FXML
    private TextField vehiclemodeltextfield;

    @FXML
    private RadioButton yesradiobutton;

    @FXML
    void generateOnActionButton(ActionEvent event) {

    }

}
