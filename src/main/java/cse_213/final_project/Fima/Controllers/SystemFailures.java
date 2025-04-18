package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SystemFailures {

    @FXML
    private ComboBox<String> BoothNocombobox;

    @FXML
    private TableColumn<String, SystemFailures> BoothNotablecolumn;

    @FXML
    private TableColumn<String, SystemFailures> Devicetablecolumn;

    @FXML
    private ComboBox<String> IssueTypecombobox;

    @FXML
    private TableColumn<String, SystemFailures> IssueTypetablecolumn;

    @FXML
    private TableColumn<String, SystemFailures> Prioritytablecolumn;

    @FXML
    private ComboBox<String> devicecombobox;

    @FXML
    private RadioButton noradiobutton;

    @FXML
    private TableView<SystemFailures> showdatatableview;

    @FXML
    private RadioButton yesradiobutton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void homeonactionbutton(ActionEvent event) {

    }

    @FXML
    void submitonactionbutton(ActionEvent event) {

    }

}
