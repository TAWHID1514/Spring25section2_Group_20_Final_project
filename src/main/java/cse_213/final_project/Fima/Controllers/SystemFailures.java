package cse_213.final_project.Fima.Controllers;

import cse_213.final_project.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
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

    ArrayList<SystemFailures> systemFailuresArrayList;
    ToggleGroup tg;

    @javafx.fxml.FXML
    public void initialize() {


        tg = new ToggleGroup();
        yesradiobutton.setToggleGroup(tg);
        noradiobutton.setToggleGroup(tg);

        BoothNocombobox.getItems().addAll("1","2","3","4","5","6");
        IssueTypecombobox.getItems().addAll("TECHNICALISSUE","MAINTENANCEISSUE","SOFTWAREISSUE");
        devicecombobox.getItems().addAll("CAMERA","MOUSE","PC");




        BoothNotablecolumn.setCellValueFactory(new PropertyValueFactory<String,SystemFailures>("Booth No"));
        IssueTypetablecolumn.setCellValueFactory(new PropertyValueFactory<String,SystemFailures>("Issue Type"));
        Devicetablecolumn.setCellValueFactory(new PropertyValueFactory<String,SystemFailures>(" Device "));
        Prioritytablecolumn.setCellValueFactory(new PropertyValueFactory<String,SystemFailures>("Priority"));










    }

    @FXML
    void homeonactionbutton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LiaisonOfficer_Dashboard_V2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setTitle("Hello");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void submitonactionbutton(ActionEvent event) {

        String Priority="";
        if(yesradiobutton.isSelected())
            Priority="Yes";
        else if (noradiobutton.isSelected())
            Priority="No";




    }

}
