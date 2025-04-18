package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class InterdepartmentalCommunicationL4 {

    @FXML
    private TableColumn<String,InterdepartmentalCommunicationL4> MessageTitletablecolumn;

    @FXML
    private TableColumn<String, InterdepartmentalCommunicationL4> Sendertablecolumn;

    @FXML
    private TableColumn<String, InterdepartmentalCommunicationL4> Statustablecolumn;

    @FXML
    private TextField receivertextfield;

    @FXML
    private TextArea replymassagetextarea;

    @FXML
    private TableView<?> showdatatableview;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void loadonactionbutton(ActionEvent event) {

    }

    @FXML
    void sendonactionbutton(ActionEvent event) {

    }

}
