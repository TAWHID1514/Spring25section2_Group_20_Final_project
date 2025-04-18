package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TollBoothStaffManagementL1 {

    @FXML
    private ComboBox<?> SendingDepertmentcombobox;

    @FXML
    private TableColumn<String, TollBoothStaffManagementL1> SendingDepertmenttablecloumn;

    @FXML
    private TableColumn<String, TollBoothStaffManagementL1> StaffIDtablecloumn;

    @FXML
    private TextField StaffIDtextfield;

    @FXML
    private TableColumn<String, TollBoothStaffManagementL1> StaffNametablecolumn;

    @FXML
    private TextField StaffNametextfield;

    @FXML
    private TextArea issuedescribetextarea;

    @FXML
    private TableView<?> showdatatableview;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void homeonactionbutton(ActionEvent event) {

    }

    @FXML
    void sendonactionbutton(ActionEvent event) {

    }

}
