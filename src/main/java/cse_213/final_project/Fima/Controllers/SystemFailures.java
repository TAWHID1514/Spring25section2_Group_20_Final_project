package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

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

        BoothNocombobox.getItems().addAll("1","2","3","4","5","6");
        IssueTypecombobox.getItems().addAll("TECHNICALISSUE","MAINTENANCEISSUE","SOFTWAREISSUE");
        devicecombobox.getItems().addAll("CAMERA","MOUSE","PC");




        BoothNotablecolumn.setCellValueFactory(new PropertyValueFactory<String,SystemFailures>("Booth No"));
        IssueTypetablecolumn.setCellValueFactory(new PropertyValueFactory<String,SystemFailures>("Issue Type"));
        Devicetablecolumn.setCellValueFactory(new PropertyValueFactory<String,SystemFailures>(" Device "));
        Prioritytablecolumn.setCellValueFactory(new PropertyValueFactory<String,SystemFailures>("Priority"));


        ArrayList<SystemFailures> systemFailuresArrayList;
        ToggleGroup tg;

        String Priority="";
        if(yesradiobutton.isSelected())
            Priority="Yes";
        else if (noradiobutton.isSelected())
            Priority="No";







    }

    @FXML
    void homeonactionbutton(ActionEvent event) {

    }

    @FXML
    void submitonactionbutton(ActionEvent event) {

    }

}
