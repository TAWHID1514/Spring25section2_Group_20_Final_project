package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ExternalInquiriesContractorsOfficialsL7 {

    @FXML
    private TableColumn<String, ExternalInquiriesContractorsOfficialsL7> ContactInfotablecolumn;

    @FXML
    private TableColumn<String, ExternalInquiriesContractorsOfficialsL7> Departmenttablecolumn;

    @FXML
    private TableColumn<String, ExternalInquiriesContractorsOfficialsL7> InquiriesPurposetablecolumn;

    @FXML
    private TableColumn<String, ExternalInquiriesContractorsOfficialsL7> Nametablecolumn;

    @FXML
    private TextField contactinfotextfield;

    @FXML
    private ComboBox<String> departmentcombobox;

    @FXML
    private TableColumn<String, ExternalInquiriesContractorsOfficialsL7> idtablecolumn;

    @FXML
    private TextField idtextfield;

    @FXML
    private TextArea inquiriespurposetextarea;

    @FXML
    private TextField nametextfield;

    @FXML
    private TableView<?> showdatatableview;

    @FXML
    private Label showmassagelable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void approveonactionbutton(ActionEvent event) {

    }

    @FXML
    void homeonactionbutton(ActionEvent event) {

    }

}
