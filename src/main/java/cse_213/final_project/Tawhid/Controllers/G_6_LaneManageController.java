package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import cse_213.final_project.Tawhid.laneManagement;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class G_6_LaneManageController
{
    @javafx.fxml.FXML
    private TableColumn<laneManagement,String> LanetwoCOL;
    @javafx.fxml.FXML
    private TableColumn<laneManagement,String> LanethreeCOL;
    @javafx.fxml.FXML
    private TableColumn<laneManagement,String> LanetfourCOL;
    @javafx.fxml.FXML
    private TableColumn<laneManagement,String> laneSixCOL;
    @javafx.fxml.FXML
    private TableView<String> alortedTV;
    @javafx.fxml.FXML
    private TableColumn<laneManagement,String> laneFiveCol;
    @javafx.fxml.FXML
    private TableColumn<laneManagement,String> LaneoneCOL;
    @javafx.fxml.FXML
    private ComboBox<String> Lane5CB;
    @javafx.fxml.FXML
    private ComboBox<String>  Lane6CB;
    @javafx.fxml.FXML
    private ComboBox<String>  Lane1CB;
    @javafx.fxml.FXML
    private ComboBox<String>  Lane2CB;
    @javafx.fxml.FXML
    private ComboBox<String>  Lane3CB;
    @javafx.fxml.FXML
    private ComboBox<String>  Lane4CB;

    @javafx.fxml.FXML
    public void initialize() {
        Lane1CB.getItems().addAll("Bus", "Track", "Bike", "Car", "CNG");
        Lane2CB.getItems().addAll("Bus", "Track", "Bike", "Car", "CNG");
        Lane3CB.getItems().addAll("Bus", "Track", "Bike", "Car", "CNG");
        Lane4CB.getItems().addAll("Bus", "Track", "Bike", "Car", "CNG");
        Lane5CB.getItems().addAll("Bus", "Track", "Bike", "Car", "CNG");
        Lane6CB.getItems().addAll("Bus", "Track", "Bike", "Car", "CNG");
        LaneoneCOL.setCellValueFactory(new PropertyValueFactory<>("lane1"));
        LanetwoCOL.setCellValueFactory(new PropertyValueFactory<>("lane2"));
        LanethreeCOL.setCellValueFactory(new PropertyValueFactory<>("lane3"));
        LanetfourCOL.setCellValueFactory(new PropertyValueFactory<>("lane4"));
        laneFiveCol.setCellValueFactory(new PropertyValueFactory<>("lane5"));
        laneSixCOL.setCellValueFactory(new PropertyValueFactory<>("lane6"));
    }


    @javafx.fxml.FXML
    public void SaveOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AllowRouteOA(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/Dashboard_TCO.fxml");
    }
}